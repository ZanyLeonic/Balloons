package com.leonic.balloons.init;

import com.leonic.balloons.blocks.*;
import com.leonic.balloons.helpers.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
/**
 * A class which calls the RegisterHelper to register the blocks on startup.
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BalloonsBlocks {
	
	private static Block blockBalloon = new BlockBalloon(Material.cloth);
	private static Block blockColls = new BlockColls(Material.cloth);
    /**
     * Uses RegisterHelper to register all the blocks.
     */
	public static void registerBlocks()
    {
		blockBalloon = new BlockBalloon(Material.cloth).setBlockName("balloonblock");
    	GameRegistry.registerBlock(blockBalloon, "balloon");
    	RegisterHelper.registerBlock(blockColls);
    }
}
