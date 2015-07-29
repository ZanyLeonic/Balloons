package com.leonic.balloons.init;

import com.leonic.balloons.blocks.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BalloonsBlocks {
	
	private static Block blockBalloon = new BlockBalloon(Material.cloth);
    
	public static void registerBlocks()
    {
		blockBalloon = new BlockBalloon(Material.cloth).setBlockName("balloonblock");
    	GameRegistry.registerBlock(blockBalloon, "balloon");
    }
}
