package com.leonic.balloons.renderer;

import org.lwjgl.opengl.GL11;

import com.leonic.balloons.References;
import com.leonic.balloons.models.ModelBalloon;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
/**
 * Used to render the Balloon model in OpenGL. Very complicated stuff.
 * Pink coloured Balloon
 * @author ZanyLeonic
 * @version 1.8-0.1
 * 
 */

public class RenderBalloonPink extends TileEntitySpecialRenderer {
	
	private static final ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/models/balloon_pink.png");
	
	private ModelBalloon model;
	
	public RenderBalloonPink() {
		this.model = new ModelBalloon();
	}
	
	/**
	 * ONLY FOR THE BALLOON MODEL. Usually called by {@link com.leonic.balloons.proxies.ClientRegistry} in the ClientProxy.
	 * Usually used by Minecraft's game engine
	 * 
	 * @param tilentity_
	 * @param x [double] x coordinate
	 * @param y [double] y coordinate
	 * @param z [double] z coordinate
 	 * @param f [float] ?
	 *   
	 */
	@Override
	public void renderTileEntityAt(TileEntity p_180535_1_, double posX, double posZ, double p_180535_6_,
			float p_180535_8_, int p_180535_9_) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)posX + 0.5F, (float)p_180535_6_ + 1.5F, (float)posZ + 0.5F);
			GL11.glRotatef(180, 0, 0, 1F);
			
			this.bindTexture(texture);
			
			GL11.glPushMatrix();
				this.model.renderModel(0.0625F); //Original value 0.0625F Old value 0.125F
			GL11.glPopMatrix();
		GL11.glPopMatrix();
		
	}
}
