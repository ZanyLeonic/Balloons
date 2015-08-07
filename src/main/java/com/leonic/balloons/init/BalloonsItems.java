package com.leonic.balloons.init;

import com.leonic.balloons.helpers.RegisterHelper;
import com.leonic.balloons.items.ItemRubber;
import com.leonic.balloons.items.ItemRubberBall;
import com.leonic.balloons.items.ItemRubberNozzle;
import com.leonic.balloons.items.ItemRubberSheet;
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
/**
 * A class which calls the RegisterHelper to register the items on startup.
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BalloonsItems {

	//Balloons items
    public static Item itemRubber = new ItemRubber("rubber");
    public static Item itemRubberSheet = new ItemRubberSheet("rubbersheet");
    public static Item itemRubberNozzle = new ItemRubberNozzle("rubbernozzle");
    public static Item itemRubberBall = new ItemRubberBall("rubberball");
    
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
    
    /**
     * Uses RegisterHelper to register all the items.
     */
    public static void registerItems()
    {
        RegisterHelper.registerItem(itemRubber);
        RegisterHelper.registerItem(itemRubberSheet);
        RegisterHelper.registerItem(itemRubberNozzle);
        RegisterHelper.registerItem(itemRubberBall);
        
        RegisterHelper.registerItem(itemBalloonBlack);
        RegisterHelper.registerItem(itemBalloonBlue);
        RegisterHelper.registerItem(itemBalloonBrown);
        RegisterHelper.registerItem(itemBalloonCyan);
        RegisterHelper.registerItem(itemBalloonGreen);
        RegisterHelper.registerItem(itemBalloonGrey);
        RegisterHelper.registerItem(itemBalloonLBlue);
        RegisterHelper.registerItem(itemBalloonLGrey);
        RegisterHelper.registerItem(itemBalloonLime);
        RegisterHelper.registerItem(itemBalloonMagenta);
        RegisterHelper.registerItem(itemBalloonOrange);
        RegisterHelper.registerItem(itemBalloonPink);
        RegisterHelper.registerItem(itemBalloonPurple);
        RegisterHelper.registerItem(itemBalloonRed);
        RegisterHelper.registerItem(itemBalloonWhite);
        RegisterHelper.registerItem(itemBalloonYellow);
    }
}
