package com.leonic.balloons;

import com.leonic.balloons.helpers.DropHandler;
import com.leonic.balloons.helpers.LogHelper;
import com.leonic.balloons.helpers.UpdateHelper;
import com.leonic.balloons.init.BalloonsBlocks;
import com.leonic.balloons.init.BalloonsEntity;
import com.leonic.balloons.init.BalloonsItems;
import com.leonic.balloons.init.BalloonsRecipes;
import com.leonic.balloons.init.BalloonsSmelting;
import com.leonic.balloons.init.BalloonsTileEntities;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

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
			return BalloonsItems.itemBalloonBlue;
		}
	};
	
	//Rarity loaded from configuration
	public static int villageBlacksmithRarity = 20;
	public static int pyramidDesertChest = 50;
	public static int dungeonChest = 5;
	public static int strongholdCorridor = 8;
	public static int strongholdLibrary = 1;
	public static int jungleTempleDispenser = 1;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    /*
     * Property property = zuluConfig.get("Developer Debug Variables", "enableTestBlock", enableTestBlock);
	 * property.comment = "Custom Property Comment";
	 * enableTestBlock = property.getBoolean(enableTestBlock);
	 * config.addCustomCategoryComment("Developer Debug Variables", "Custom Comment Number 1");
     */
    	
    	
    //Configuration file
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	

    	config.load();
    	
    	References.ENTITY_BALLOONS_ID = config.get("ENTITY_ID", "ENTITY_BUNCHOFBALLOONS_ID", 580).getInt();
    	
    	//Rarity from Config
    	villageBlacksmithRarity = config.get("ITEM_RARITY", "BLACKSMITH_RARITY", 20).getInt();
    	pyramidDesertChest = config.get("ITEM_RARITY", "PYRAMIDTEMPLE_RARITY", 50).getInt();
    	dungeonChest = config.get("ITEM_RARITY", "DUNGEONCHEST_RARITY", 5).getInt();
    	strongholdCorridor = config.get("ITEM_RARITY","STRONGHOLDCORRIDOR_RARITY", 8).getInt();
    	strongholdLibrary = config.get("ITEM_RARITY", "STRONGHOLDLIBRARY_RARITY", 1).getInt();
    	jungleTempleDispenser = config.get("ITEM_RARITY", "JUNGLETEMPLEDISPENSER_RARITY", 1).getInt();
    	
    	config.addCustomCategoryComment("ENTITY_ID", "Sets the entity ID for items like the Bunch of Balloons. Only use if it conflicts with another mod.");
    	config.addCustomCategoryComment("ITEM_RARITY", "Sets the Rarity of items in these mods from showing up in Dungeon chests.");
    	config.setCategoryRequiresMcRestart("ENTITY_ID", true);
    	config.setCategoryRequiresMcRestart("ITEM_RARITY", true);
    	
    	LogHelper.info("Config read...");
    	
    	config.save();
    	
    	LogHelper.info("Bunch Of Balloons Entity has an ID of: " + References.ENTITY_BALLOONS_ID);
    	LogHelper.info("Config saved...");
    	
    //Registering Entities
    	BalloonsEntity.registerEntities();
    	
    //Registering custom Items, Blocks, CreativeTabs, Crafting recipes, Smelting recipes & TileEntities.
    	BalloonsItems.registerItems();
    	BalloonsBlocks.registerBlocks();
       	BalloonsRecipes.init();
       	BalloonsSmelting.init();
       	BalloonsTileEntities.register();
       	
    //Runs Minetweaker scripts
    	
    //Renderer
    	leonicProxy.registerRenderThings();
 
    //Adds updater as a Event
    	FMLCommonHandler.instance().bus().register(new UpdateHandler());
        UpdateHelper.init();
        
     //Registering drops
        MinecraftForge.EVENT_BUS.register(new DropHandler());
        
     //Adding loot to chests
     // Add new loot (Params: Itemstack(theItem), min, max, rarity)
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubber),1,4,villageBlacksmithRarity));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubber),1,6,pyramidDesertChest));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubber),1,3,dungeonChest));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubberBall),1,5,strongholdCorridor));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubberBall),1,1,strongholdLibrary));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(BalloonsItems.itemRubberSheet),1,1,jungleTempleDispenser));
        
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
