package com.leonic.balloons.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Registers all Crafting recipes on startup.
 * @author ZanyLeonic
 * @version 1.8-0.1
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
			GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonBlack),
					"BAB",
					"A A",
					"BCB",
					'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
		//Red Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonRed),
					    "BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,1), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
		//Green Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonGreen),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,2), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
		//Brown Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonBrown),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,3), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
		
				
		//Blue Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonBlue),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,4), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Purple Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonPurple),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,5), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Cyan Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonCyan),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,6), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Light Grey Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonLGrey),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,7), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Grey Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonGrey),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,8), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Pink Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonPink),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,9), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Lime Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonLime),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,10), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Yellow Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonYellow),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,11), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Light Blue Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonLBlue),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,12), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Magenta Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonMagenta),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,13), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//Orange Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonOrange),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,14), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
		//White Balloon
				GameRegistry.addRecipe(new ItemStack(BalloonsItems.itemBalloonWhite),
						"BAB",
					    "A A",
					    "BCB",
					    'A',new ItemStack(BalloonsItems.itemRubberSheet), 'B', new ItemStack(Items.dye,1 ,15), 'C', new ItemStack(BalloonsItems.itemRubberNozzle));
				
	}
	
	/**
	 * Adds support for other mods (e.g IC2 and Minefactory Reloaded)
	 * API is not available for 1.8
	 */
	
	public static void externalRecpies() {
	/*
		Boolean isIC2Loaded = FunctionHandler.isModLoaded("IC2");
		if(isIC2Loaded == true){
			if(References.ALLOW_IC2_INTERGRATION == true){
			LogHelper.info("IC2 is loaded. Adding intergration.");
			
			Recipes.macerator.addRecipe(new RecipeInputItemStack(IC2Items.getItem("rubber")), null, new ItemStack(BalloonsItems.itemRubber, 2));
			LogHelper.info("Added macerator recipes...");
			
			Recipes.compressor.addRecipe(new RecipeInputItemStack(IC2Items.getItem("rubber")), null, new ItemStack(BalloonsItems.itemRubberSheet));
			Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(BalloonsItems.itemRubberBall)), null, new ItemStack(BalloonsItems.itemRubberSheet));
			Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(BalloonsItems.itemRubberSheet, 3)), null, new ItemStack(BalloonsItems.itemRubberBall));
			Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(BalloonsItems.itemRubber, 2)), null, IC2Items.getItem("rubber"));
			
			LogHelper.info("Added compressor recipes...");
			}else{
				LogHelper.info("IC2 is loaded, but the config has ALLOW_INTERGRATION on IC2 is set to false.");
				LogHelper.info("You can change this in the config, but it isn't necessary.");
			}
		}else{
			LogHelper.info("IC2 is not loaded, No biggy. Disabling intergration.");
		}
	*/
	}
	

}
