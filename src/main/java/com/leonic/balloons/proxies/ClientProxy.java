package com.leonic.balloons.proxies;

import com.leonic.balloons.renderer.RenderBalloon;
import com.leonic.balloons.tileentities.TileEntityBalloonBlock;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/**
 * Renders and does stuff on the client side.
 * @author ZanyLeonic 
 * @version 0.1
 */
public class ClientProxy extends CommonProxy {
	
	/**
	 * Registers 3D models for blocks that aren't blocks.
	 * 
	 * @see com.leonic.balloons.proxies.CommonProxy#registerRenderThings()
	 */
	public void registerRenderThings() {
		//Balloon
		TileEntitySpecialRenderer render = new RenderBalloon();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlock.class, render);
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
}
