package com.leonic.balloons.helpers;

import com.leonic.balloons.init.BalloonsCTab;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RegisterHelper 
{
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
    
    public static void registerTabs(){
    	CreativeTabs BalloonsCTab = new BalloonsCTab("BalloonsCTab");
    }
}
