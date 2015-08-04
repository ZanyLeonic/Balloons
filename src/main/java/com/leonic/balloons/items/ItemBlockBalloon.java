package com.leonic.balloons.items;

import java.awt.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBalloon extends ItemBlock {

	public ItemBlockBalloon(Block block, int colour) {
		super(block);
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean show) { 
		list.add("This is the strongest metal in"); 
	}
}
