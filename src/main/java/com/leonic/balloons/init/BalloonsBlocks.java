package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.blocks.BlockBalloonBlack;
import com.leonic.balloons.blocks.BlockBalloonCollision;
import com.leonic.balloons.blocks.BlockBalloonBlue;
import com.leonic.balloons.blocks.BlockBalloonBrown;
import com.leonic.balloons.blocks.BlockBalloonCyan;
import com.leonic.balloons.blocks.BlockBalloonGreen;
import com.leonic.balloons.blocks.BlockBalloonGrey;
import com.leonic.balloons.blocks.BlockBalloonLBlue;
import com.leonic.balloons.blocks.BlockBalloonLGrey;
import com.leonic.balloons.blocks.BlockBalloonLime;
import com.leonic.balloons.blocks.BlockBalloonMagenta;
import com.leonic.balloons.blocks.BlockBalloonOrange;
import com.leonic.balloons.blocks.BlockBalloonPink;
import com.leonic.balloons.blocks.BlockBalloonPurple;
import com.leonic.balloons.blocks.BlockBalloonRed;
import com.leonic.balloons.blocks.BlockBalloonWhite;
import com.leonic.balloons.blocks.BlockBalloonYellow;
import com.leonic.balloons.helpers.RegisterHelper;

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
	
	//Balloon blocks
	public static Block blockBalloonBlack = new BlockBalloonBlack();
	public static Block blockBalloonBlue = new BlockBalloonBlue();
	public static Block blockBalloonBrown = new BlockBalloonBrown();
	public static Block blockBalloonCyan = new BlockBalloonCyan();
	public static Block blockBalloonLBlue = new BlockBalloonLBlue();
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
	
	//Collision blocks
	public static Block blockBalloonBlackColls = new BlockBalloonCollision("colls1", "black");
	public static Block blockBalloonBlueColls = new BlockBalloonCollision("colls2", "blue");
	public static Block blockBalloonBrownColls = new BlockBalloonCollision("colls3", "brown");
	public static Block blockBalloonCyanColls = new BlockBalloonCollision("colls4", "cyan");
	public static Block blockBalloonGreenColls = new BlockBalloonCollision("colls5", "green");
	public static Block blockBalloonGreyColls = new BlockBalloonCollision("colls6", "grey");
	public static Block blockBalloonLBlueColls = new BlockBalloonCollision("colls7", "lblue");
	public static Block blockBalloonLGreyColls = new BlockBalloonCollision("colls8", "lgrey");
	public static Block blockBalloonLimeColls = new BlockBalloonCollision("colls9", "lime");
	public static Block blockBalloonMagentaColls = new BlockBalloonCollision("colls10", "magenta2");
	public static Block blockBalloonOrangeColls = new BlockBalloonCollision("colls11", "orange");
	public static Block blockBalloonPinkColls = new BlockBalloonCollision("colls12", "pink");
	public static Block blockBalloonPurpleColls = new BlockBalloonCollision("colls13", "purple");
	public static Block blockBalloonRedColls = new BlockBalloonCollision("colls14", "red");
	public static Block blockBalloonWhiteColls = new BlockBalloonCollision("colls15", "white");
	public static Block blockBalloonYellowColls = new BlockBalloonCollision("colls16", "yellow");
	
	
    /**
     * Uses RegisterHelper to register all the blocks. (Not for custom model blocks.)
     */
	public static void registerBlocks()
    {
		
		//Declaring the Balloons
		blockBalloonBlack = new BlockBalloonBlack().setBlockName("balloon_black");
		blockBalloonBlue = new BlockBalloonBlue().setBlockName("balloon_blue");
		blockBalloonBrown = new BlockBalloonBrown().setBlockName("balloon_brown");
		blockBalloonCyan = new BlockBalloonCyan().setBlockName("balloon_cyan");
		blockBalloonLBlue = new BlockBalloonLBlue().setBlockName("balloon_lblue");
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
    	
		//Registering with Balloons with GameRegistry
		GameRegistry.registerBlock(blockBalloonBlack, "balloon_black");
		GameRegistry.registerBlock(blockBalloonBlue, "balloon_blue");
		GameRegistry.registerBlock(blockBalloonBrown, "balloon_brown");
		GameRegistry.registerBlock(blockBalloonCyan, "balloon_cyan");
		GameRegistry.registerBlock(blockBalloonLBlue, "balloon_lblue");
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
		
		//Registering the Collision blocks
		RegisterHelper.registerBlock(blockBalloonBlackColls);
		RegisterHelper.registerBlock(blockBalloonBlueColls);
		RegisterHelper.registerBlock(blockBalloonBrownColls);
		RegisterHelper.registerBlock(blockBalloonCyanColls);
		RegisterHelper.registerBlock(blockBalloonGreenColls);
		RegisterHelper.registerBlock(blockBalloonGreyColls);
		RegisterHelper.registerBlock(blockBalloonLBlueColls);
		RegisterHelper.registerBlock(blockBalloonLGreyColls);
		RegisterHelper.registerBlock(blockBalloonLimeColls);
		RegisterHelper.registerBlock(blockBalloonMagentaColls);
		RegisterHelper.registerBlock(blockBalloonOrangeColls);
		RegisterHelper.registerBlock(blockBalloonPinkColls);
		RegisterHelper.registerBlock(blockBalloonPurpleColls);
		RegisterHelper.registerBlock(blockBalloonRedColls);
		RegisterHelper.registerBlock(blockBalloonWhiteColls);
		RegisterHelper.registerBlock(blockBalloonYellowColls);
		
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
		blockBalloonLBlue.setCreativeTab(Balloons.balloons);
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
