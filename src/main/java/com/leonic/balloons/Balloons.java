package com.leonic.balloons;

import com.leonic.balloons.blocks.BlockBalloon;
import com.leonic.balloons.helpers.LogHelper;
import com.leonic.balloons.init.BalloonsBlocks;
import com.leonic.balloons.init.BalloonsItems;
import com.leonic.balloons.items.ItemRubber;
import com.leonic.balloons.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)


public class Balloons {
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY)
	public static CommonProxy proxy;

	@Instance(References.MODID)
	public static Balloons instance;
	
    public static Item itemRubber = new ItemRubber("rubber");
    public static Block blockBalloon = new BlockBalloon(1);
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	BalloonsItems.registerItems();
    	BalloonsBlocks.registerBlocks();
    	GameRegistry.addSmelting(itemRubber, new ItemStack(blockBalloon), 99.9f);
    	LogHelper.info("Grabbing the Heilum tanks.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
