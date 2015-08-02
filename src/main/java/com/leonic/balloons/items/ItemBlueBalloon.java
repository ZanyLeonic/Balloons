package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import com.leonic.balloons.blocks.BlockBalloon;
import com.leonic.balloons.blocks.BlockColls;
import com.leonic.balloons.helpers.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.lang.*;
/**
 * An item which places down the BalloonBlock and BlockColls automatically.
 * 
 * @author Leonic
 * @version 0.1
 */
public class ItemBlueBalloon extends Item {
	
	private static Block blockBalloon = new BlockBalloon(Material.cloth);
	private static Block blockColls = new BlockColls(Material.cloth);
	
	public ItemBlueBalloon(String name){
		setUnlocalizedName(name);
		setMaxStackSize(16);
		setCreativeTab(Balloons.balloons);
		setTextureName(References.MODID + ":" + "bluballoon");
	}
	
	/**
	 * Places down the block when the item is used.
	 * 
	 * @param stack [ItemStack]
	 * @param player [EntityPlayer]
	 * @param world [World] 
	 * @param x [int] x
	 * @param y [int] y
	 * @param z [int] z
	 * @param par7 [int] par7
	 * @param par8 [float] par8
	 * @param par9 [float] par9
	 * @param par10 [float] par10
	 */
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if(par7 != 1){
			LogHelper.warn("Returned false on first line!");
			return false;
		} else {
			if (world.isRemote) {
				return false;
			}
			if(player.canPlayerEdit(x, y + 1, z, par7, stack) && player.canPlayerEdit(x, y + 2, z, par7, stack)){
				world.setBlock(x, y + 1, z, blockBalloon);
				world.setBlock(x, y + 2, z, blockColls);
				world.notifyBlockOfNeighborChange(x, y + 1, z, blockBalloon);
				world.notifyBlockOfNeighborChange(x, y + 2, z, blockColls);
				--stack.stackSize;
				LogHelper.info("Returned true!");
				return true;
		
			}else{
				LogHelper.warn("Returned false on second line!");
				return false;
			}
		}
	}
  }
