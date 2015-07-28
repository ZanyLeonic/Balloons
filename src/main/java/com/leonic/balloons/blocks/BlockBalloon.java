package com.leonic.balloons.blocks;
import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.block.*;

public class BlockBalloon extends BlockContainer { // or extend it any block you want it to eg blockchest or blockbrewingstand

public BlockBalloon(int par1) {
super(Material.cloth);
setCreativeTab(CreativeTabs.tabDecorations);
this.setBlockName("blockname");

// change the collision box here
}
@Override
public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
{
this.setBlockBounds(0, 0, 0, 1, 1, 1);
super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
}

// block bounds which is the outline around the item
@Override
public void setBlockBoundsForItemRender()
{
this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1F, 1.0F);
}

@Override
public boolean renderAsNormalBlock(){
return false;
}

@Override
public int getRenderType(){
return -1;
}

@Override
public boolean isOpaqueCube(){
return true;
}


@Override
public TileEntity createNewTileEntity(World world, int par2) {
return new TileEntityBlockBalloon();
}
}