package com.leonic.balloons.blocks.collision;

import java.util.Random;

import com.leonic.balloons.init.BalloonsItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
/**
 * The block class for a Grey Collision block.
 * @author Leonic
 * @version 1.8-0.1
 */
public class BlockBalloonCollisionGrey extends Block {
	
	public BlockBalloonCollisionGrey(String name){
		super(Material.cloth);
		setHardness(1.0F);
		setResistance(1.0F);
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
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		pos.add(pos.getX(), pos.getY()-1, pos.getZ());
		if(!worldIn.isRemote){
			worldIn.setBlockState(pos, Blocks.air.getDefaultState());
		}
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
			return BalloonsItems.itemBalloonGrey;
    }
}
