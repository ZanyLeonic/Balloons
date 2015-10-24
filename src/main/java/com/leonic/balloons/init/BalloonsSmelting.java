package com.leonic.balloons.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Registers all the Smelting recipes from this mod.
 * @author Leonic
 * @version 1.8-0.1
 */
public class BalloonsSmelting {
	
	/**
	 * Registers all Smelting recipes when this called. 
	 */
	public static void init()
	{
		//Registering Smelting stuff
    	GameRegistry.addSmelting(BalloonsItems.itemRubber, new ItemStack(BalloonsItems.itemRubberBall, 2), 2.0F);
    	GameRegistry.addSmelting(BalloonsItems.itemRubberBall, new ItemStack(BalloonsItems.itemRubberSheet), 2.0F);
    	
	}
}
