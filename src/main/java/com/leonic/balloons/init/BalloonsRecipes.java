package com.leonic.balloons.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Registers all Crafting recipes on startup.
 * @author ZanyLeonic
 * @version 0.1
 */
public class BalloonsRecipes {
	/**
	 * Registers all crafting recipes when called.
	 */
	public static void init()
	{
		//Black Balloon
		GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonBlack),
			    "BAB",
			    "A A",
			    " A ",
			    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye));
	}
}
