package com.leonic.balloons.init;

import com.leonic.balloons.helpers.RegisterHelper;
import com.leonic.balloons.items.ItemBalloonPump;
import com.leonic.balloons.items.ItemRubber;

import net.minecraft.item.Item;
/**
 * A class which calls the RegisterHelper to register the items on startup.
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BalloonsItems {

    public static Item itemRubber = new ItemRubber("rubber");
    public static Item itemBalloonPump = new ItemBalloonPump("balloonpump");
    /**
     * Uses RegisterHelper to register all the items.
     */
    public static void registerItems()
    {
        RegisterHelper.registerItem(itemRubber);
       /* RegisterHelper.registerItem(itemBluballoon);*/
        RegisterHelper.registerItem(itemBalloonPump);
    }
}
