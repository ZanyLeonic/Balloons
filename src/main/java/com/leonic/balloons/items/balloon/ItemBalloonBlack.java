package com.leonic.balloons.items.balloon;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.init.BalloonsBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
/**
 * The item class for the Black Balloon Item.
 * @author Leonic
 * @version 1.8-0.1
 */
public class ItemBalloonBlack extends Item {
	
	public ItemBalloonBlack(String name){
		super();
		setCreativeTab(Balloons.balloons);
		setUnlocalizedName(name + "_black");
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		BlockPos pos1 = pos.add(pos.getX(),pos.getY()+1,pos.getZ());
		BlockPos pos2 = pos.add(pos.getX(),pos.getY()+2,pos.getZ());
		
		if(!worldIn.isRemote){
			if(!side.equals(1)){
				return false;
			
		}else{
			if(playerIn.canPlayerEdit(pos1, side, stack) && playerIn.canPlayerEdit(pos2, side, stack)){
				worldIn.setBlockState(pos1, BalloonsBlocks.blockBalloonBlack.getDefaultState());
				worldIn.setBlockState(pos2, BalloonsBlocks.blockBalloonBlackColls.getDefaultState());
				worldIn.notifyBlockOfStateChange(pos1, BalloonsBlocks.blockBalloonBlack);
				worldIn.notifyBlockOfStateChange(pos2, BalloonsBlocks.blockBalloonBlackColls);
				--stack.stackSize;
				return true;
			}else{
				return false;
			}
		}
	}else{
		return false;
	}
}
}
