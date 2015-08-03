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
	 * @param side [int] par7
	 * @param hitX [float] par8
	 * @param hitY [float] par9
	 * @param hitZ [float] par10
	 */
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if(side != 1){
			LogHelper.warn("Returned false on first line!");
			return false;
		} else {
			if (world.isRemote) {
				LogHelper.warn("Returned false on second line!");
				return false;
			}else{
			if(player.canPlayerEdit(x, y + 1, z, side, stack) && player.canPlayerEdit(x, y + 2, z, side, stack)){
				world.setBlock(x, y + 1, z, blockBalloon);
				world.setBlock(x, y + 2, z, blockColls);
				world.notifyBlockOfNeighborChange(x, y + 1, z, blockBalloon);
				world.notifyBlockOfNeighborChange(x, y + 2, z, blockColls);
				--stack.stackSize;
				LogHelper.info("Returned true!");
				return true;
		
			}else{
				LogHelper.warn("Returned false on third line!");
				return false;
			}
		}
	}
  }
}
