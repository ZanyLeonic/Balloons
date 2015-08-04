package com.leonic.balloons;

import com.leonic.balloons.helpers.DropHandler;
import com.leonic.balloons.helpers.LogHelper;
import com.leonic.balloons.helpers.UpdateHelper;
import com.leonic.balloons.init.BalloonsBlocks;
import com.leonic.balloons.init.BalloonsItems;
import com.leonic.balloons.init.UpdateHandler;
import com.leonic.balloons.items.ItemRubber;
import com.leonic.balloons.proxies.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Balloons mod main class
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)


public class Balloons {
	//Items & Block declarations
	public static Item itemRubber = new ItemRubber("rubber");
	
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
    	//Registering custom items and blocks
    	BalloonsItems.registerItems();
    	BalloonsBlocks.registerBlocks();
    	BalloonsBlocks.registerCreativeTabs();
    	
    	//Renderer
    	leonicProxy.registerRenderThings();
    	
    	//Registering Smelting stuff
    	GameRegistry.addSmelting(Items.diamond, new ItemStack(Balloons.itemRubber), 1.0F);
    	
    	//Adds updater as a Event
    	FMLCommonHandler.instance().bus().register(new UpdateHandler());
        UpdateHelper.init();
        
    	//"Got past PreInit stage" message.
    	LogHelper.info("Grabbing the Helium tanks...");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Registering drops
    	FMLCommonHandler.instance().bus().register(new DropHandler());
    	
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
