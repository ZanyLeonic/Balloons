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
		
		//Rubber Nozzle
		GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemRubberNozzle),
				"   ",
				"B B",
				" A ",
				'A',new ItemStack(BalloonsItems.itemRubberBall), 'B', new ItemStack(BalloonsItems.itemRubberSheet));
		
		//Black Balloon
			GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonBlack),
					"BAB",
					"A A",
					"BCB",
					'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
		//Red Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonRed),
					    "BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,1), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
		//Green Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonGreen),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,2), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
		//Brown Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonBrown),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,3), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
				
		//Blue Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonBlue),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,4), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Purple Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonPurple),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,5), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Cyan Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonCyan),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,6), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Light Grey Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonLGrey),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,7), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Grey Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonGrey),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,8), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Pink Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonPink),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,9), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Lime Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonLime),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,10), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Yellow Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonYellow),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,11), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Light Blue Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonLBlue),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,12), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Magenta Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonMagenta),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,13), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Orange Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonOrange),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,14), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//White Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsBlocks.blockBalloonWhite),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,15), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
	}
}
