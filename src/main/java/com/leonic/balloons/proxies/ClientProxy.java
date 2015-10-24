package com.leonic.balloons.proxies;

import com.leonic.balloons.renderer.RenderBalloonBlack;
import com.leonic.balloons.renderer.RenderBalloonBlue;
import com.leonic.balloons.renderer.RenderBalloonBrown;
import com.leonic.balloons.renderer.RenderBalloonCyan;
import com.leonic.balloons.renderer.RenderBalloonGreen;
import com.leonic.balloons.renderer.RenderBalloonGrey;
import com.leonic.balloons.renderer.RenderBalloonLBlue;
import com.leonic.balloons.renderer.RenderBalloonLGrey;
import com.leonic.balloons.renderer.RenderBalloonLime;
import com.leonic.balloons.renderer.RenderBalloonMagenta;
import com.leonic.balloons.renderer.RenderBalloonOrange;
import com.leonic.balloons.renderer.RenderBalloonPink;
import com.leonic.balloons.renderer.RenderBalloonPurple;
import com.leonic.balloons.renderer.RenderBalloonRed;
import com.leonic.balloons.renderer.RenderBalloonWhite;
import com.leonic.balloons.renderer.RenderBalloonYellow;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockBlack;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockBlue;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockBrown;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockCyan;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockGreen;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockGrey;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLBlue;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLGrey;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLime;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockMagenta;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockOrange;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockPink;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockPurple;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockRed;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockWhite;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockYellow;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;

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
		TileEntitySpecialRenderer blackrender = new RenderBalloonBlack();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockBlack.class, blackrender);
		
		TileEntitySpecialRenderer blurender = new RenderBalloonBlue();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockBlue.class, blurender);
		
		TileEntitySpecialRenderer brownrender = new RenderBalloonBrown();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockBrown.class, brownrender);
		
		TileEntitySpecialRenderer cyanrender = new RenderBalloonCyan();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockCyan.class, cyanrender);
		
		TileEntitySpecialRenderer lbluerender = new RenderBalloonLBlue();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockLBlue.class, lbluerender);
		
		TileEntitySpecialRenderer greenrender = new RenderBalloonGreen();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockGreen.class, greenrender);
		
		TileEntitySpecialRenderer greyrender = new RenderBalloonGrey();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockGrey.class, greyrender);
		
		TileEntitySpecialRenderer lgreyrender = new RenderBalloonLGrey();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockLGrey.class, lgreyrender);
		
		TileEntitySpecialRenderer limerender = new RenderBalloonLime();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockLime.class, limerender);
		
		TileEntitySpecialRenderer magentarender = new RenderBalloonMagenta();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockMagenta.class, magentarender);
		
		TileEntitySpecialRenderer orangerender = new RenderBalloonOrange();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockOrange.class, orangerender);
		
		TileEntitySpecialRenderer pinkrender = new RenderBalloonPink();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockPink.class, pinkrender);
		
		TileEntitySpecialRenderer purplerender = new RenderBalloonPurple();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockPurple.class, purplerender);
		
		TileEntitySpecialRenderer redrender = new RenderBalloonRed();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockRed.class, redrender);
		
		TileEntitySpecialRenderer whiterender = new RenderBalloonWhite();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockWhite.class, whiterender);
		
		TileEntitySpecialRenderer yellowrender = new RenderBalloonYellow();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlockYellow.class, yellowrender);
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
	
	@Override
	public void registerRenderInformation(){
		
		/* Unfinished
		 * if (BalloonsItems.itemBunchOfBalloon != null) {
			RenderingRegistry.registerEntityRenderingHandler(EntityBalloon.class, new EntityBunchOfBalloonsRenderer());
			MinecraftForgeClient.registerItemRenderer(BalloonsItems.itemBunchOfBalloon, new ItemRendererBunchOfBalloons());
			MinecraftForge.EVENT_BUS.register(new HoverBalloonRenderHandler());
		}
		*/
	}
}
