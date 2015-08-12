package com.leonic.balloons.entity;

import io.netty.buffer.ByteBuf;

import java.util.Map;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.leonic.balloons.helpers.LogHelper;
import com.leonic.balloons.items.ItemHoverBalloon;

import com.google.common.collect.MapMaker;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBalloon extends Entity implements IEntityAdditionalSpawnData {
	private static final int PROPERTY_DEPLOYED = 17;

	private static Map<EntityPlayer, EntityBalloon> balloonMap = new MapMaker().weakKeys().weakValues().makeMap();

	public static boolean isEntityHoldingGlider(Entity player) {
		EntityBalloon balloon = balloonMap.get(player);
		return balloon != null;
	}

	public static boolean isGliderDeployed(Entity player) {
		EntityBalloon balloon = balloonMap.get(player);
		return balloon == null || balloon.isDeployed();
	}

	private static boolean isGliderValid(EntityPlayer player, EntityBalloon balloon) {
		if (player == null || player.isDead || balloon == null || balloon.isDead) return false;

		ItemStack held = player.getHeldItem();
		if (held == null || !(held.getItem() instanceof ItemHoverBalloon)) return false;
		if (player.worldObj.provider.dimensionId != balloon.worldObj.provider.dimensionId) return false;
		return true;
	}

	@SideOnly(Side.CLIENT)
	public static void updateGliders(World worldObj) {
		for (Map.Entry<EntityPlayer, EntityBalloon> e : balloonMap.entrySet()) {
			EntityPlayer player = e.getKey();
			EntityBalloon balloon = e.getValue();
			if (isGliderValid(player, balloon)) balloon.fixPositions(player, player instanceof EntityPlayerSP);
			else balloon.setDead();
		}
	}

	private EntityPlayer player;

	public EntityBalloon(World world) {
		super(world);
	}

	public EntityBalloon(World world, EntityPlayer player) {
		this(world);
		this.player = player;
	}

	@Override
	public void readSpawnData(ByteBuf data) {
		int playerId = data.readInt();

		Entity e = worldObj.getEntityByID(playerId);

		if (e instanceof EntityPlayer) {
			player = (EntityPlayer)e;
			balloonMap.put(player, this);
		} else {
			setDead();
		}
	}

	@Override
	public void writeSpawnData(ByteBuf data) {
		if (player == null) {
			LogHelper.warn("Got Balloon without player id (%s)");
			data.writeInt(-42);
		} else {
			data.writeInt(player.getEntityId());
		}
	}

	@Override
	protected void entityInit() {
		this.dataWatcher.addObject(PROPERTY_DEPLOYED, (byte)1);
	}

	public boolean isDeployed() {
		return this.dataWatcher.getWatchableObjectByte(PROPERTY_DEPLOYED) == 1;
	}

	@Override
	public void onUpdate() {
		if (!isGliderValid(player, this)) {
			setDead();
		}

		if (isDead) {
			balloonMap.remove(player);
			return;
		}

		boolean isDeployed = player.onGround || player.isInWater();

		if (!worldObj.isRemote) {
			this.dataWatcher.updateObject(PROPERTY_DEPLOYED, (byte)(isDeployed? 1 : 0));
			fixPositions(player, false);
		}

		if (!isDeployed && player.motionY < 0) {
			final double horizontalSpeed;
			final double verticalSpeed;

			if (player.isSneaking()) {
				horizontalSpeed = 0.1;
				verticalSpeed = 0.3;
			} else {
				horizontalSpeed = 0.01;
				verticalSpeed = 0.1;
			}

			player.motionY *= verticalSpeed;
			motionY *= verticalSpeed;
			double x = Math.cos(Math.toRadians(player.rotationYawHead + 90)) * horizontalSpeed;
			double z = Math.sin(Math.toRadians(player.rotationYawHead + 90)) * horizontalSpeed;
			player.motionX += x;
			player.motionZ += z;
			player.fallDistance = 0f; /* Don't like getting hurt :( */
		}

	}

	public EntityPlayer getPlayer() {
		return player;
	}

	@Override
	public void setDead() {
		super.setDead();
		balloonMap.remove(player);
	}

	private void fixPositions(EntityPlayer thePlayer, boolean localPlayer) {
		this.lastTickPosX = prevPosX = player.prevPosX;
		this.lastTickPosY = prevPosY = player.prevPosY;
		this.lastTickPosZ = prevPosZ = player.prevPosZ;

		this.posX = player.posX;
		this.posY = player.posY;
		this.posZ = player.posZ;

		setPosition(posX, posY, posZ);
		this.prevRotationYaw = player.prevRenderYawOffset;
		this.rotationYaw = player.renderYawOffset;

		this.prevRotationPitch = player.prevRotationPitch;
		this.rotationPitch = player.rotationPitch;

		if (!localPlayer) {
			this.posY += 1.2;
			this.prevPosY += 1.2;
			this.lastTickPosY += 1.2;
		}

		this.motionX = this.posX - this.prevPosX;
		this.motionY = this.posY - this.prevPosY;
		this.motionZ = this.posZ - this.prevPosZ;
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {}

	@Override
	public boolean writeToNBTOptional(NBTTagCompound p_70039_1_) {
		return false;
	}

}
