package com.leonic.balloons.init;

import com.leonic.balloons.helpers.RegisterHelper;
import com.leonic.balloons.items.ItemBlueBalloon;
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
    public static Item itemBluballoon = new ItemBlueBalloon("bluballoon");
    /**
     * Uses RegisterHelper to register all the items.
     */
    public static void registerItems()
    {
        RegisterHelper.registerItem(itemRubber);
        RegisterHelper.registerItem(itemBluballoon);
    }
}
