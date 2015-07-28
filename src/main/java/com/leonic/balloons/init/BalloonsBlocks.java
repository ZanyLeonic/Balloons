package com.leonic.balloons.init;

import com.leonic.balloons.blocks.BlockBalloon;
import com.leonic.balloons.blocks.RenderTileEntityBlockBalloon;
import com.leonic.balloons.blocks.TileEntityBlockBalloon;
import com.leonic.balloons.helpers.RegisterHelper;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BalloonsBlocks {
	
   // public static Block decBalloon = new BlockBalloon("balloon");

    public static void registerBlocks()
    {
    //	RegisterHelper.registerBlock(decBalloon);
    	GameRegistry.registerTileEntity(TileEntityBlockBalloon.class, "balloon");
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockBalloon.class, new RenderTileEntityBlockBalloon());

    }
}
