package com.leonic.balloons.items.balloon;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import com.leonic.balloons.init.BalloonsBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
/**
 * The item class for the Light Blue Balloon Item.
 * @author Leonic
 * @version 0.1
 */
public class ItemBalloonLBlue extends Item {
	
	public ItemBalloonLBlue(String name){
		super();
		setCreativeTab(Balloons.balloons);
		setTextureName(References.MODID + ":" + name + "_lblue");
		setUnlocalizedName(name + "_lblue");
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int var7, float var8, float var9, float var10)
	{
		if(!world.isRemote){
			if(var7 != 1){
				return false;
			
		}else{
			if(player.canPlayerEdit(x, y + 1, z, var7, stack) && player.canPlayerEdit(x, y + 2, z, var7, stack)){
				world.setBlock(x, y + 1, z, BalloonsBlocks.blockBalloonLBlue);
				world.setBlock(x, y + 2, z, BalloonsBlocks.blockBalloonLBlueColls);
				world.notifyBlockOfNeighborChange(x, y + 1, z, BalloonsBlocks.blockBalloonLBlue);
				world.notifyBlockOfNeighborChange(x, y + 2, z, BalloonsBlocks.blockBalloonLBlueColls);
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
