package com.leonic.balloons.init;

import java.util.Random;

import com.leonic.balloons.References;
import com.leonic.balloons.blocks.BlockBalloonBlack;
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
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionBlack;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionBlue;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionBrown;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionCyan;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionGreen;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionGrey;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionLBlue;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionLGrey;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionLime;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionMagenta;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionOrange;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionPink;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionPurple;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionRed;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionWhite;
import com.leonic.balloons.blocks.collision.BlockBalloonCollisionYellow;
import com.leonic.balloons.helpers.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * A class which calls the RegisterHelper to register the blocks on startup.
 * For custom model blocks we don't use RegisterHelper.
 * @author ZanyLeonic
 * @version 0.2
 * 
 */
public class BalloonsBlocks {
	
	//Balloons SoundTypes
	public static final Block.SoundType soundTypeBalloon = new Block.SoundType("balloon", 1.0F, 1.0F)
    {
        private static final String __OBFID = "CL_00000701";
        /**
         * Used when a block breaks, e.g.: Player break, Sheep eating grass, etc..
         */
        @Override
        public String getBreakSound()
        {
			return References.MODID + ":" + "dig.balloon";
            
        }
        
        public String getStepResourcePath()
        {
			return References.MODID + ":" + "step.balloon";
        }
    };
	
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
	public static Block blockBalloonBlackColls = new BlockBalloonCollisionBlack("colls1").setStepSound(soundTypeBalloon);
	public static Block blockBalloonBlueColls = new BlockBalloonCollisionBlue("colls2").setStepSound(soundTypeBalloon);
	public static Block blockBalloonBrownColls = new BlockBalloonCollisionBrown("colls3").setStepSound(soundTypeBalloon);
	public static Block blockBalloonCyanColls = new BlockBalloonCollisionCyan("colls4").setStepSound(soundTypeBalloon);
	public static Block blockBalloonGreenColls = new BlockBalloonCollisionGreen("colls5").setStepSound(soundTypeBalloon);
	public static Block blockBalloonGreyColls = new BlockBalloonCollisionGrey("colls6").setStepSound(soundTypeBalloon);
	public static Block blockBalloonLBlueColls = new BlockBalloonCollisionLBlue("colls7").setStepSound(soundTypeBalloon);
	public static Block blockBalloonLGreyColls = new BlockBalloonCollisionLGrey("colls8").setStepSound(soundTypeBalloon);
	public static Block blockBalloonLimeColls = new BlockBalloonCollisionLime("colls9").setStepSound(soundTypeBalloon);
	public static Block blockBalloonMagentaColls = new BlockBalloonCollisionMagenta("colls10").setStepSound(soundTypeBalloon);
	public static Block blockBalloonOrangeColls = new BlockBalloonCollisionOrange("colls11").setStepSound(soundTypeBalloon);
	public static Block blockBalloonPinkColls = new BlockBalloonCollisionPink("colls12").setStepSound(soundTypeBalloon);
	public static Block blockBalloonPurpleColls = new BlockBalloonCollisionPurple("colls13").setStepSound(soundTypeBalloon);
	public static Block blockBalloonRedColls = new BlockBalloonCollisionRed("colls14").setStepSound(soundTypeBalloon);
	public static Block blockBalloonWhiteColls = new BlockBalloonCollisionWhite("colls15").setStepSound(soundTypeBalloon);
	public static Block blockBalloonYellowColls = new BlockBalloonCollisionYellow("colls16").setStepSound(soundTypeBalloon);
	
    /**
     * Uses RegisterHelper to register all the blocks. (Not for custom model blocks.)
     */
	public static void registerBlocks()
    {
		
		//Declaring the Balloons
		blockBalloonBlack = new BlockBalloonBlack().setBlockName("balloon_black").setStepSound(soundTypeBalloon);
		blockBalloonBlue = new BlockBalloonBlue().setBlockName("balloon_blue").setStepSound(soundTypeBalloon);
		blockBalloonBrown = new BlockBalloonBrown().setBlockName("balloon_brown").setStepSound(soundTypeBalloon);
		blockBalloonCyan = new BlockBalloonCyan().setBlockName("balloon_cyan").setStepSound(soundTypeBalloon);
		blockBalloonLBlue = new BlockBalloonLBlue().setBlockName("balloon_lblue").setStepSound(soundTypeBalloon);
		blockBalloonGreen = new BlockBalloonGreen().setBlockName("balloon_green").setStepSound(soundTypeBalloon);
		blockBalloonGrey = new BlockBalloonGrey().setBlockName("balloon_grey").setStepSound(soundTypeBalloon);
		blockBalloonLGrey = new BlockBalloonLGrey().setBlockName("balloon_lgrey").setStepSound(soundTypeBalloon);
		blockBalloonLime = new BlockBalloonLime().setBlockName("balloon_lime").setStepSound(soundTypeBalloon);
		blockBalloonMagenta = new BlockBalloonMagenta().setBlockName("balloon_magenta").setStepSound(soundTypeBalloon);
		blockBalloonOrange = new BlockBalloonOrange().setBlockName("balloon_orange").setStepSound(soundTypeBalloon);
		blockBalloonPink = new BlockBalloonPink().setBlockName("balloon_pink").setStepSound(soundTypeBalloon);
		blockBalloonPurple = new BlockBalloonPurple().setBlockName("balloon_purple").setStepSound(soundTypeBalloon);
		blockBalloonRed = new BlockBalloonRed().setBlockName("balloon_red").setStepSound(soundTypeBalloon);
		blockBalloonWhite = new BlockBalloonWhite().setBlockName("balloon_white").setStepSound(soundTypeBalloon);
		blockBalloonYellow = new BlockBalloonYellow().setBlockName("balloon_yellow").setStepSound(soundTypeBalloon);
    	
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
}
