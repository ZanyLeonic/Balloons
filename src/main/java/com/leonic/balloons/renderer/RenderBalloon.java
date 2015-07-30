package com.leonic.balloons.renderer;

import org.lwjgl.opengl.GL11;

import com.leonic.balloons.References;
import com.leonic.balloons.models.ModelBalloon;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
/*
 * @author ZanyLeonic
 * Used to render the Balloon model in OpenGL. Very complicated stuff.
 * 
 */

public class RenderBalloon extends TileEntitySpecialRenderer {

	private static final ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/models/balloon.png");
	
	private ModelBalloon model;
	
	public RenderBalloon() {
		this.model = new ModelBalloon();
	}
	
	/*
	 * ONLY FOR THE BALLOON MODEL. Usually called by {@link #ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBalloonBlock.class, render);} in the ClientProxy.
	 * Usually used by Minecraft's game engine
	 * 
	 * @param TileEntity
	 * @param double x [double] x coordinate
	 * @param double y [double] y coordinate
	 * @param double z [double] z coordinate
 	 * @param float f [float] ?
	 *   
	 */
	@Override
	public void renderTileEntityAt(TileEntity tilentity_, double x, double y, double z, float f) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
			GL11.glRotatef(180, 0, 0, 1F);
			
			this.bindTexture(texture);
			
			GL11.glPushMatrix();
				this.model.renderModel(0.125F); //Old value 0.0625F
			GL11.glPopMatrix();
		GL11.glPopMatrix();
		
	}

}
