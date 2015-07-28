package com.leonic.balloons.blocks;

import net.minecraft.tileentity.TileEntity;


public class TileEntityBlockBalloon extends TileEntity { // same thing as in block class can have it extend tileentitychest / brewstand etc

/* Rotation */
public float rotation = 0;
/* Scale */
public float scale = 0;

@Override
public void updateEntity(){
/* Increments 0.5 This can be changed */
if (worldObj.isRemote) rotation += 0.5;
/* Whatever you want your scale to be */
if (worldObj.isRemote) rotation = (float) 0.5;
}
}