package com.leonic.balloons.proxies;

import com.leonic.balloons.renderer.RenderBalloon;
import com.leonic.balloons.tileentities.TileEntityBalloonBlock;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class ClientProxy extends CommonProxy {
	
	public void registerRenderThings() {
		 //Balloon
		TileEntitySpecialRenderer render = new RenderBalloon();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlock.class, render);
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
}
