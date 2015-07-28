package com.leonic.balloons.blocks;

import org.lwjgl.opengl.GL11;

import com.leonic.balloons.References;
import com.leonic.balloons.helpers.LogHelper;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderTileEntityBlockBalloon extends TileEntitySpecialRenderer {

ResourceLocation texture;
ResourceLocation objModelLocation;
IModelCustom model;

public RenderTileEntityBlockBalloon(){
texture = new ResourceLocation(References.MODID, "textures/models/balloon.png"); //
objModelLocation = new ResourceLocation(References.MODID, "models/balloon.obj");
model = AdvancedModelLoader.loadModel(objModelLocation);
LogHelper.debug("Balloons inflated.");
}

@Override
public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
TileEntityBlockBalloon te2 = (TileEntityBlockBalloon) te;


bindTexture(texture);

GL11.glPushMatrix();
GL11.glTranslated(posX + 0.5, posY + 0, posZ + 0.5);
model.renderAll();
GL11.glPopMatrix();
}

}