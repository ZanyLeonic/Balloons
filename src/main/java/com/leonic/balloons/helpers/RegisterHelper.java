package com.leonic.balloons.helpers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
/*
 * @author ZanyLeonic
 * Registers Blocks and Items.
 * Usually used by BalloonsItems and BalloonsBlocks. 
 * 
 * BalloonsItems @see com.leonic.balloons.init.BalloonsItems
 * BalloonsBlocks @see com.leonic.balloons.init.BalloonsBlocks
 * 
 */
public class RegisterHelper 
{
	/*
	 * Registers blocks 
	 * 
	 * @param Block [block] A non-vanilla block
	 * 
	 */
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }
	/*
	 * Registers items
	 * 
	 * @param Item [item] A non-vanilla item
	 * 
	 */
    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
    
}
