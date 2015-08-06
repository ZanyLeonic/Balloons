package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import com.leonic.balloons.init.BalloonsBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBalloon extends Item {
	
	public ItemBalloon(String name){
		super();
		setCreativeTab(Balloons.balloons);
		setTextureName(References.MODID + ":" + name);
		setUnlocalizedName(name);
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int var7, float var8, float var9, float var10)
	{
		if(!world.isRemote){
			if(!world.blockExists(x, y+1, z) && world.blockExists(x, y+2, z)){
				world.setBlock(x, y+1, z, BalloonsBlocks.blockBalloonBlack);
				world.setBlock(x, y+2, z, BalloonsBlocks.blockBalloonBlack);
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	    return false;
	}

	
}
