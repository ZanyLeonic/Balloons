package com.leonic.balloons.helpers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
/**
 * Registers Blocks and Items.
 * Usually used by BalloonsItems and BalloonsBlocks. 
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class RegisterHelper 
{
	/**
	 * Registers blocks 
	 * 
	 * @param block [Block] A non-vanilla block
	 */
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }
	/**
	 * Registers items
	 * 
	 * @param item [Item] A non-vanilla item
	 * 
	 */
    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
    
}
