package com.leonic.balloons.items;

import java.util.Map;

import com.google.common.collect.MapMaker;
import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import com.leonic.balloons.entity.EntityBalloon;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHoverBalloon extends Item {

	private static Map<EntityPlayer, EntityBalloon> spawnedballoonsMap = new MapMaker().weakKeys().weakValues().makeMap();
	private static String itemName;
	
	public ItemHoverBalloon(String name) {
		itemName = name;
		setCreativeTab(Balloons.balloons);
	}

	@Override
	public void registerIcons(IIconRegister registry) {
		itemIcon = registry.registerIcon(References.MODID + ":" + itemName);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if (!world.isRemote && player != null) {
			EntityBalloon balloon = spawnedballoonsMap.get(player);
			if (balloon != null) despawnballoon(player, balloon);
			else spawnballoon(player);
		}
		return itemStack;
	}

	private static void despawnballoon(EntityPlayer player, EntityBalloon balloon) {
		balloon.setDead();
		spawnedballoonsMap.remove(player);
	}

	private static void spawnballoon(EntityPlayer player) {
		EntityBalloon balloon = new EntityBalloon(player.worldObj, player);
		balloon.setPositionAndRotation(player.posX, player.posY, player.posZ, player.rotationPitch, player.rotationYaw);
		player.worldObj.spawnEntityInWorld(balloon);
		spawnedballoonsMap.put(player, balloon);
	}
}
