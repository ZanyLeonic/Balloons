package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * A class which calls the RegisterHelper to register the blocks on startup.
 * For custom model blocks we don't use RegisterHelper.
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BalloonsBlocks {
	
	public static Block blockBalloonBlack = new BlockBalloonBlack();
	public static Block blockBalloonBlue = new BlockBalloonBlue();
	public static Block blockBalloonBrown = new BlockBalloonBrown();
	public static Block blockBalloonCyan = new BlockBalloonCyan();
	public static Block blockBalloonDBlue = new BlockBalloonDBlue();
	public static Block blockBalloonGreen = new BlockBalloonGreen();
	public static Block blockBalloonGrey = new BlockBalloonGrey();
	public static Block blockBalloonLGrey = new BlockBalloonLGrey();
	public static Block blockBalloonLime = new BlockBalloonLime();
	public static Block blockBalloonMagenta = new BlockBalloonMagenta();
	public static Block blockBalloonOrange = new BlockBalloonOrange();
	public static Block blockBalloonPink = new BlockBalloonPink();
	public static Block blockBalloonPurple = new BlockBalloonPurple();
	public static Block blockBalloonRed = new BlockBalloonRed();
	public static Block blockBalloonWhite = new BlockBalloonWhite();
	public static Block blockBalloonYellow = new BlockBalloonYellow();
	
	
    /**
     * Uses RegisterHelper to register all the blocks. (Not for custom model blocks.)
     */
	public static void registerBlocks()
    {
		
		//Declaring the Blocks names
		blockBalloonBlack = new BlockBalloonBlack().setBlockName("balloon_black");
		blockBalloonBlue = new BlockBalloonBlue().setBlockName("balloon_blue");
		blockBalloonBrown = new BlockBalloonBrown().setBlockName("balloon_brown");
		blockBalloonCyan = new BlockBalloonCyan().setBlockName("balloon_cyan");
		blockBalloonDBlue = new BlockBalloonDBlue().setBlockName("balloon_dblue");
		blockBalloonGreen = new BlockBalloonGreen().setBlockName("balloon_green");
		blockBalloonGrey = new BlockBalloonGrey().setBlockName("balloon_grey");
		blockBalloonLGrey = new BlockBalloonLGrey().setBlockName("balloon_lgrey");
		blockBalloonLime = new BlockBalloonLime().setBlockName("balloon_lime");
		blockBalloonMagenta = new BlockBalloonMagenta().setBlockName("balloon_magenta");
		blockBalloonOrange = new BlockBalloonOrange().setBlockName("balloon_orange");
		blockBalloonPink = new BlockBalloonPink().setBlockName("balloon_pink");
		blockBalloonPurple = new BlockBalloonPurple().setBlockName("balloon_purple");
		blockBalloonRed = new BlockBalloonRed().setBlockName("balloon_red");
		blockBalloonWhite = new BlockBalloonWhite().setBlockName("balloon_white");
		blockBalloonYellow = new BlockBalloonYellow().setBlockName("balloon_yellow");
    	
		//Registering with GameRegistry
		GameRegistry.registerBlock(blockBalloonBlack, "balloon_black");
		GameRegistry.registerBlock(blockBalloonBlue, "balloon_blue");
		GameRegistry.registerBlock(blockBalloonBrown, "balloon_brown");
		GameRegistry.registerBlock(blockBalloonCyan, "balloon_cyan");
		GameRegistry.registerBlock(blockBalloonDBlue, "balloon_dblue");
		GameRegistry.registerBlock(blockBalloonGreen, "balloon_green");
		GameRegistry.registerBlock(blockBalloonGrey, "balloon_grey");
		GameRegistry.registerBlock(blockBalloonLGrey, "balloon_lgrey");
		GameRegistry.registerBlock(blockBalloonLime, "balloon_lime");
		GameRegistry.registerBlock(blockBalloonMagenta, "balloon_magenta");
		GameRegistry.registerBlock(blockBalloonOrange, "balloon_orange");
		GameRegistry.registerBlock(blockBalloonPink, "balloon_pink");
		GameRegistry.registerBlock(blockBalloonPurple, "balloon_purple");
		GameRegistry.registerBlock(blockBalloonRed, "balloon_red");
		GameRegistry.registerBlock(blockBalloonWhite, "balloon_white");
		GameRegistry.registerBlock(blockBalloonYellow, "balloon_yellow");
    }
	/**
	 * Puts all custom blocks into a CreativeTab.
	 */
	public static void registerCreativeTabs(){
		
		//Registering CreativeTabs for the Balloons.
		blockBalloonBlack.setCreativeTab(Balloons.balloons);
		blockBalloonBlue.setCreativeTab(Balloons.balloons);
		blockBalloonBrown.setCreativeTab(Balloons.balloons);
		blockBalloonCyan.setCreativeTab(Balloons.balloons);
		blockBalloonDBlue.setCreativeTab(Balloons.balloons);
		blockBalloonGreen.setCreativeTab(Balloons.balloons);
		blockBalloonGrey.setCreativeTab(Balloons.balloons);
		blockBalloonLGrey.setCreativeTab(Balloons.balloons);
		blockBalloonLime.setCreativeTab(Balloons.balloons);
		blockBalloonMagenta.setCreativeTab(Balloons.balloons);
		blockBalloonOrange.setCreativeTab(Balloons.balloons);
		blockBalloonPink.setCreativeTab(Balloons.balloons);
		blockBalloonPurple.setCreativeTab(Balloons.balloons);
		blockBalloonRed.setCreativeTab(Balloons.balloons);
		blockBalloonWhite.setCreativeTab(Balloons.balloons);
		blockBalloonYellow.setCreativeTab(Balloons.balloons);
	}
}
