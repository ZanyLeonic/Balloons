package com.leonic.balloons.init;

//import com.leonic.balloons.items.ItemHoverBalloon;
import com.leonic.balloons.items.ItemRubber;
import com.leonic.balloons.items.ItemRubberBall;
import com.leonic.balloons.items.ItemRubberNozzle;
import com.leonic.balloons.items.ItemRubberSheet;
import com.leonic.balloons.items.DropIt;
import com.leonic.balloons.items.balloon.ItemBalloonBlack;
import com.leonic.balloons.items.balloon.ItemBalloonBlue;
import com.leonic.balloons.items.balloon.ItemBalloonBrown;
import com.leonic.balloons.items.balloon.ItemBalloonCyan;
import com.leonic.balloons.items.balloon.ItemBalloonGreen;
import com.leonic.balloons.items.balloon.ItemBalloonGrey;
import com.leonic.balloons.items.balloon.ItemBalloonLBlue;
import com.leonic.balloons.items.balloon.ItemBalloonLGrey;
import com.leonic.balloons.items.balloon.ItemBalloonLime;
import com.leonic.balloons.items.balloon.ItemBalloonMagenta;
import com.leonic.balloons.items.balloon.ItemBalloonOrange;
import com.leonic.balloons.items.balloon.ItemBalloonPink;
import com.leonic.balloons.items.balloon.ItemBalloonPurple;
import com.leonic.balloons.items.balloon.ItemBalloonRed;
import com.leonic.balloons.items.balloon.ItemBalloonWhite;
import com.leonic.balloons.items.balloon.ItemBalloonYellow;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
/**
 * A class which calls the GameRegistry to register the items on startup.
 * @author ZanyLeonic
 * @version 1.8-0.1
 * 
 */
public class BalloonsItems {

	//Balloons items
    public static Item itemRubber = new ItemRubber("rubber");
    public static Item itemRubberSheet = new ItemRubberSheet("rubbersheet");
    public static Item itemRubberNozzle = new ItemRubberNozzle("rubbernozzle");
    public static Item itemRubberBall = new ItemRubberBall("rubberball");
    // unfinished public static Item itemBunchOfBalloon = new ItemHoverBalloon("bunchofballoon");
    
    //Balloons block items
    public static Item itemBalloonBlack = new ItemBalloonBlack("ballooni");
    public static Item itemBalloonBlue = new ItemBalloonBlue("ballooni");
    public static Item itemBalloonBrown = new ItemBalloonBrown("ballooni");
    public static Item itemBalloonCyan = new ItemBalloonCyan("ballooni");
    public static Item itemBalloonGreen = new ItemBalloonGreen("ballooni");
    public static Item itemBalloonGrey = new ItemBalloonGrey("ballooni");
    public static Item itemBalloonLBlue = new ItemBalloonLBlue("ballooni");
    public static Item itemBalloonLGrey = new ItemBalloonLGrey("ballooni");
    public static Item itemBalloonLime = new ItemBalloonLime("ballooni");
    public static Item itemBalloonMagenta = new ItemBalloonMagenta("ballooni");
    public static Item itemBalloonOrange = new ItemBalloonOrange("ballooni");
    public static Item itemBalloonPink = new ItemBalloonPink("ballooni");
    public static Item itemBalloonPurple = new ItemBalloonPurple("ballooni");
    public static Item itemBalloonRed = new ItemBalloonRed("ballooni");
    public static Item itemBalloonWhite = new ItemBalloonWhite("ballooni");
    public static Item itemBalloonYellow = new ItemBalloonYellow("ballooni");
    
    //Records... lol
    public static Item record_dropit = new DropIt("dropit");
    
    
    /**
     * Uses GameRegistry to register all the items.
     */
    public static void registerItems()
    {
    	
        GameRegistry.registerItem(itemRubber, "rubber");
        GameRegistry.registerItem(itemRubberSheet, "rubbersheet");
        GameRegistry.registerItem(itemRubberNozzle, "rubbernozzle");
        GameRegistry.registerItem(itemRubberBall, "rubberball");
        // unfinished GameRegistry.registerItem(itemBunchOfBalloon);
        GameRegistry.registerItem(itemBalloonBlack, "ballooni_1");
        GameRegistry.registerItem(itemBalloonBlue, "ballooni_2");
        GameRegistry.registerItem(itemBalloonBrown, "ballooni_3");
        GameRegistry.registerItem(itemBalloonCyan, "ballooni_4");
        GameRegistry.registerItem(itemBalloonGreen, "ballooni_5");
        GameRegistry.registerItem(itemBalloonGrey, "ballooni_6");
        GameRegistry.registerItem(itemBalloonLBlue, "ballooni_7");
        GameRegistry.registerItem(itemBalloonLGrey, "ballooni_8");
        GameRegistry.registerItem(itemBalloonLime, "ballooni_9");
        GameRegistry.registerItem(itemBalloonMagenta, "ballooni_10");
        GameRegistry.registerItem(itemBalloonOrange, "ballooni_11");
        GameRegistry.registerItem(itemBalloonPink, "ballooni_12");
        GameRegistry.registerItem(itemBalloonPurple, "ballooni_13");
        GameRegistry.registerItem(itemBalloonRed, "ballooni_14");
        GameRegistry.registerItem(itemBalloonWhite, "ballooni_15");
        GameRegistry.registerItem(itemBalloonYellow, "ballooni_16");
        
        GameRegistry.registerItem(record_dropit, "record");
    }
}
