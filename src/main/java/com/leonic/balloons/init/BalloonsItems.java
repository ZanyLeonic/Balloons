package com.leonic.balloons.init;

import com.leonic.balloons.helpers.RegisterHelper;
import com.leonic.balloons.items.ItemRubber;
import com.leonic.balloons.items.ItemRubberBall;
import com.leonic.balloons.items.ItemRubberNozzle;
import com.leonic.balloons.items.ItemRubberSheet;

import net.minecraft.item.Item;
/**
 * A class which calls the RegisterHelper to register the items on startup.
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BalloonsItems {

    public static Item itemRubber = new ItemRubber("rubber");
    public static Item itemRubberSheet = new ItemRubberSheet("rubbersheet");
    public static Item itemRubberNozzle = new ItemRubberNozzle("rubbernozzle");
    public static Item itemRubberBall = new ItemRubberBall("rubberball");
    
    /**
     * Uses RegisterHelper to register all the items.
     */
    public static void registerItems()
    {
        RegisterHelper.registerItem(itemRubber);
        RegisterHelper.registerItem(itemRubberSheet);
        RegisterHelper.registerItem(itemRubberNozzle);
        RegisterHelper.registerItem(itemRubberBall);
    }
}
