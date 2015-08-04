package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * A class which calls the RegisterHelper to register the blocks on startup.
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BalloonsBlocks {
	
	private static Block blockBalloon0 = new BlockBalloon(0);
	private static Block blockBalloon1 = new BlockBalloon(1);
	private static Block blockBalloon2 = new BlockBalloon(2);
	private static Block blockBalloon3 = new BlockBalloon(3);
	private static Block blockBalloon4 = new BlockBalloon(4);
	private static Block blockBalloon5 = new BlockBalloon(5);
	private static Block blockBalloon6 = new BlockBalloon(6);
	private static Block blockBalloon7 = new BlockBalloon(7);
	private static Block blockBalloon8 = new BlockBalloon(8);
	private static Block blockBalloon9 = new BlockBalloon(9);
	private static Block blockBalloon10 = new BlockBalloon(10);
	private static Block blockBalloon11 = new BlockBalloon(11);
	private static Block blockBalloon12 = new BlockBalloon(12);
	private static Block blockBalloon13 = new BlockBalloon(13);
	private static Block blockBalloon14 = new BlockBalloon(14);
	private static Block blockBalloon15 = new BlockBalloon(15);
	
    /**
     * Uses RegisterHelper to register all the blocks.
     */
	public static void registerBlocks()
    {
		blockBalloon0 = new BlockBalloon(0).setBlockName("balloon_white");
		blockBalloon1 = new BlockBalloon(1).setBlockName("balloon_red");
		blockBalloon2 = new BlockBalloon(2).setBlockName("balloon_orange");
		blockBalloon3 = new BlockBalloon(3).setBlockName("balloon_yellow");
		blockBalloon4 = new BlockBalloon(4).setBlockName("balloon_lime");
		blockBalloon5 = new BlockBalloon(5).setBlockName("balloon_green");
		blockBalloon6 = new BlockBalloon(6).setBlockName("balloon_cyan");
		blockBalloon7 = new BlockBalloon(7).setBlockName("balloon_dblue");
		blockBalloon8 = new BlockBalloon(8).setBlockName("balloon_blue");
		blockBalloon9 = new BlockBalloon(9).setBlockName("balloon_purple");
		blockBalloon10 = new BlockBalloon(10).setBlockName("balloon_mag");
		blockBalloon11 = new BlockBalloon(11).setBlockName("balloon_pink");
		blockBalloon12 = new BlockBalloon(12).setBlockName("balloon_lgrey");
		blockBalloon13 = new BlockBalloon(13).setBlockName("balloon_grey");
		blockBalloon14 = new BlockBalloon(14).setBlockName("balloon_black");
		blockBalloon15 = new BlockBalloon(15).setBlockName("balloon_brown");
		
    	GameRegistry.registerBlock(blockBalloon0, "balloon_white");
    	GameRegistry.registerBlock(blockBalloon1, "balloon_red");
    	GameRegistry.registerBlock(blockBalloon2, "balloon_orange");
    	GameRegistry.registerBlock(blockBalloon3, "balloon_yellow");
    	GameRegistry.registerBlock(blockBalloon4, "balloon_lime");
    	GameRegistry.registerBlock(blockBalloon5, "balloon_green");
    	GameRegistry.registerBlock(blockBalloon6, "balloon_cyan");
    	GameRegistry.registerBlock(blockBalloon7, "balloon_dblue");
    	GameRegistry.registerBlock(blockBalloon8, "balloon_blue");
    	GameRegistry.registerBlock(blockBalloon9, "balloon_purple");
    	GameRegistry.registerBlock(blockBalloon10, "balloon_mag");
    	GameRegistry.registerBlock(blockBalloon11, "balloon_pink");
    	GameRegistry.registerBlock(blockBalloon12, "balloon_lgrey");
    	GameRegistry.registerBlock(blockBalloon13, "balloon_grey");
    	GameRegistry.registerBlock(blockBalloon14, "balloon_black");
    	GameRegistry.registerBlock(blockBalloon15, "balloon_brown");
    	
    	
    }
	
	public static void registerCreativeTabs(){
		blockBalloon0.setCreativeTab(Balloons.balloons);
		blockBalloon1.setCreativeTab(Balloons.balloons);
		blockBalloon2.setCreativeTab(Balloons.balloons);
		blockBalloon3.setCreativeTab(Balloons.balloons);
		blockBalloon4.setCreativeTab(Balloons.balloons);
		blockBalloon5.setCreativeTab(Balloons.balloons);
		blockBalloon6.setCreativeTab(Balloons.balloons);
		blockBalloon7.setCreativeTab(Balloons.balloons);
		blockBalloon8.setCreativeTab(Balloons.balloons);
		blockBalloon9.setCreativeTab(Balloons.balloons);
		blockBalloon10.setCreativeTab(Balloons.balloons);
		blockBalloon11.setCreativeTab(Balloons.balloons);
		blockBalloon12.setCreativeTab(Balloons.balloons);
		blockBalloon13.setCreativeTab(Balloons.balloons);
		blockBalloon14.setCreativeTab(Balloons.balloons);
		blockBalloon15.setCreativeTab(Balloons.balloons);
	}
}
