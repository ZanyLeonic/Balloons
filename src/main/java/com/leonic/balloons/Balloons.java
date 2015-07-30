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
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)

public class Balloons {
	/*
	 * @author ZanyLeonic
	 * 
	 * Balloons mod main class
	 * 
	 */
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY)
	public static CommonProxy leonicProxy;

	@Instance(References.MODID)
	public static Balloons instance;
	
	//Custom creative tab
	public static CreativeTabs balloons = new CreativeTabs("balloonsMod")
	{
	public Item getTabIconItem()
	{
	return Items.arrow;
	}
	};
	
	//Items & Block declarations
	public static Item itemRubber = new ItemRubber("rubber");
	public static Block blockBalloon = new BlockBalloon(Material.cloth);
	
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	BalloonsItems.registerItems();
    	BalloonsBlocks.registerBlocks();
    	//Renderer
    	leonicProxy.registerRenderThings();
    	
    	LogHelper.info("Grabbing the Helium tanks...");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Registering drops
    	MinecraftForge.EVENT_BUS.register(new DropHandler());
    	
    	//Smelting recipes
    	GameRegistry.addSmelting(new ItemStack(itemRubber), new ItemStack(blockBalloon), 0.1f);
    	
    	LogHelper.info("Grabbing Balloons...");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    	LogHelper.info("Balloons ready! Let's have some fun!");
    }

}
