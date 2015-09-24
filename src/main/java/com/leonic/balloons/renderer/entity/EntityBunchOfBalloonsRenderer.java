package com.leonic.balloons.renderer.entity;

import org.lwjgl.opengl.GL11;

import com.leonic.balloons.References;
import com.leonic.balloons.entity.EntityBalloon;
import com.leonic.balloons.models.ModelBalloon;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class EntityBunchOfBalloonsRenderer extends Render {

	public static final float QUAD_HALF_SIZE = 2.4f;
	private static final float ONGROUND_ROTATION = 90f;
	private static ModelBalloon model;
	
	private static final ResourceLocation texture = new ResourceLocation(References.MODID, "textures/models/balloon_orange.png");

	@Override
	public void doRender(Entity entity, double x, double y, double z, float f, float f1) {
		model = new ModelBalloon();
		final EntityBalloon balloon = (EntityBalloon)entity;
		final EntityPlayer owner = balloon.getPlayer();
		if (owner == null) return;

		final Minecraft minecraft = Minecraft.getMinecraft();
		final boolean isLocalPlayer = owner == minecraft.thePlayer;
		final boolean isFpp = minecraft.gameSettings.thirdPersonView == 0;
		final boolean isDeployed = balloon.isDeployed();

		if (isLocalPlayer && isFpp && isDeployed) return;

		final float rotation = interpolateRotation(balloon.prevRotationYaw, balloon.rotationYaw, f1);

		GL11.glPushMatrix();
		
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180.0F - rotation, 0, 0, 1F);

		if (isLocalPlayer) {
			if (isDeployed) {
				// move up and closer to back
				GL11.glTranslated(0, -0.2, +0.3);
			} else {
				if (isFpp) {
					// move over head when flying in FPP
					//GL11.glTranslated(0, +0.2, 0);
				} else {
					// move closer to back and forward when flying in TDD
					//GL11.glTranslated(0, -0.8, -1.0);
				}
			}
		} else {
			if (isDeployed) {
				// move up little bit (other player center is lower)
				//GL11.glTranslated(0, +0.2, +0.3);
			} else {
				// move closer to back and forward when flying
				//GL11.glTranslated(0, -0.5, -1.0);
			}
		}

		if (isDeployed) {
			GL11.glRotatef(ONGROUND_ROTATION, 0, 0, 0);
			//GL11.glScalef(0.4f, 1f, 0.4f);
			
		}

		bindTexture(texture);
		renderBalloon();

		GL11.glPopMatrix();
	}

	private static void renderBalloon() {
		model.renderModel(0.0625F);
	}

	/* Interpolate rotation */
	private static float interpolateRotation(float prevRotation, float nextRotation, float modifier) {
		float rotation = nextRotation - prevRotation;

		while (rotation < -180.0F)
			rotation += 360.0F;

		while (rotation >= 180.0F) {
			rotation -= 360.0F;
		}

		return prevRotation + modifier * rotation;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
