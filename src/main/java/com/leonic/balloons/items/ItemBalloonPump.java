package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.blocks.BlockBalloon;
import com.leonic.balloons.blocks.BlockColls;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBalloonPump extends Item {
	
	private static Block blockBalloon = new BlockBalloon(Material.cloth);
	private static Block blockColls = new BlockColls(Material.cloth);
	
	public ItemBalloonPump(String name){
		super();
		setUnlocalizedName(name);
		setTextureName(name);
		setMaxDamage(20);
		setCreativeTab(Balloons.balloons);
	}
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10){
		if(par7 != 1){
			return false;
		}else{
			if(player.canPlayerEdit(x, y + 1, z, par7, stack) && player.canPlayerEdit(x, y + 2, z, par7, stack) &&  world.isRemote){
				world.setBlock(x, y + 1, z, blockBalloon);
				world.setBlock(x, y + 2, z, blockColls);
				world.notifyBlockOfNeighborChange(x, y + 1, z, blockBalloon);
				world.notifyBlockOfNeighborChange(x, y + 2, z, blockColls);
				this.setDamage(stack, 1);
				return true;
		}else{
				return false;
			}
		}
	}
}
