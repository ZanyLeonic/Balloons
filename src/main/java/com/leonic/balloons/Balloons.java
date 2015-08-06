package com.leonic.balloons;

import com.leonic.balloons.helpers.DropHandler;
import com.leonic.balloons.helpers.LogHelper;
import com.leonic.balloons.helpers.UpdateHelper;
import com.leonic.balloons.init.BalloonsBlocks;
import com.leonic.balloons.init.BalloonsItems;
import com.leonic.balloons.init.BalloonsRecipes;
import com.leonic.balloons.init.BalloonsSmelting;
import com.leonic.balloons.init.UpdateHandler;
import com.leonic.balloons.proxies.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

/**
 * Balloons mod main class
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)


public class Balloons {
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY)
	public static CommonProxy leonicProxy;

	@Instance(References.MODID)
	public static Balloons instance;
	
	//Custom creative tab
	public static CreativeTabs balloons = new CreativeTabs("balloonsMod")
	{
		public Item getTabIconItem()
		{
			return Items.dye;
		}
	};
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    //Registering custom Items, Blocks, CreativeTabs, Crafting recipes & Smelting recipes.
    	BalloonsItems.registerItems();
    	BalloonsBlocks.registerBlocks();
    	BalloonsBlocks.registerCreativeTabs();
       	BalloonsRecipes.init();
       	BalloonsSmelting.init();
    	
    //Renderer
    	leonicProxy.registerRenderThings();
 
    //Adds updater as a Event
    	FMLCommonHandler.instance().bus().register(new UpdateHandler());
        UpdateHelper.init();
        
     //Registering drops
        MinecraftForge.EVENT_BUS.register(new DropHandler());
        
     //Adding loot to chests
     // Add new loot (Params: Itemstack(theItem), min, max, rarity)
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubber),1,4,20));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubber),1,6,50));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubber),1,3,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubberBall),1,5,8));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubberBall),1,1,1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubberSheet),1,1,1));
        
    //"Got past PreInit stage" message.
    	LogHelper.info("Grabbing the Helium tanks...");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	
    	//"Got past the Init stage" message.
    	LogHelper.info("Grabbing Balloons...");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	//"Mod loaded!" message.
    	LogHelper.info("Balloons ready! Let's have some fun!");
    }

}
