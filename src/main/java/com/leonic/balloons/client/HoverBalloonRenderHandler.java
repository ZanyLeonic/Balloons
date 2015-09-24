package com.leonic.balloons.client;

import org.lwjgl.opengl.GL11;

import com.leonic.balloons.entity.EntityBalloon;
import com.leonic.balloons.renderer.PlayerBodyRenderEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.AbstractClientPlayer;

public class HoverBalloonRenderHandler {

	@SubscribeEvent
	public void onPlayerBodyRender(PlayerBodyRenderEvent evt) {
		final AbstractClientPlayer player = evt.player;
		if (!EntityBalloon.isBalloonDeployed(player)) {
			player.limbSwing = 0f;
			player.prevLimbSwingAmount = 0f;
			player.limbSwingAmount = 0f;
			GL11.glRotatef(75, -1, 0, 0);
		}
	}
}
