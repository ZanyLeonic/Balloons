package com.leonic.balloons.blocks;

import java.util.Random;

import com.leonic.balloons.References;
import com.leonic.balloons.init.BalloonsItems;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLBlue;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
/**
 * The Block class for the Balloon.
 * For the Light Blue coloured balloon.
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BlockBalloonLBlue extends BlockContainer {
	
	public BlockBalloonLBlue() {
		super(Material.cloth);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
	}
	@Override
	public int getRenderType() {
		return -1;
	}
	@Override
	public boolean isOpaqueCube(){
		return false;	
	}
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metaData) {
		if(!world.isRemote){
			if(world.blockExists(x, y+1, z)){
				world.setBlock(x, y+1, z, Blocks.air);
			}
		}
		
	}
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return BalloonsItems.itemBalloonLBlue;
    }
	
	public boolean isFullCube()
	{
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityBalloonBlockLBlue();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + "balloon_lblue");
	}
}
