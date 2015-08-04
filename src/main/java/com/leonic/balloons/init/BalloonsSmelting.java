package com.leonic.balloons.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
/**
 * Registers all the Smelting recipes from this mod.
 * @author Leonic
 * @version 0.1
 */
public class BalloonsSmelting {
	
	/**
	 * Registers all Smelting recipes when this called. 
	 */
	public static void init()
	{
		//Registering Smelting stuff
    	GameRegistry.addSmelting(BalloonsItems.itemRubber, new ItemStack(BalloonsItems.itemRubberSheet), 2.0F);
    	
	}
}
