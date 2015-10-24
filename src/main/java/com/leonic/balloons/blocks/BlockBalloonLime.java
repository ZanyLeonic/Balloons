package com.leonic.balloons.blocks;

import java.util.Random;

import com.leonic.balloons.init.BalloonsItems;
import com.leonic.balloons.tileentities.TileEntityBalloonBlockLime;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
/**
 * The Block class for the Balloon.
 * For the Lime coloured balloon.
 * @author ZanyLeonic
 * @version 1.8-0.1
 * 
 */
public class BlockBalloonLime extends BlockContainer {
	
	public BlockBalloonLime() {
		super(Material.cloth);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		
	}
	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		pos.add(pos.getX(), pos.getY()+1, pos.getZ());
		if(!worldIn.isRemote){
			worldIn.setBlockState(pos, Blocks.air.getDefaultState());
		}
		
	}
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return BalloonsItems.itemBalloonLime;
    }
	
	public boolean isFullCube()
	{
	return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityBalloonBlockLime();
	}
}
