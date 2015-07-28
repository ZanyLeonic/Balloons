package com.leonic.balloons.init;

import com.leonic.balloons.helpers.RegisterHelper;
import com.leonic.balloons.items.ItemRubber;

import net.minecraft.item.Item;

public class BalloonsItems {
    // Class-wide variables typically will go here. Not inside methods.

    public static Item itemRubber = new ItemRubber("rubber");

    public static void registerItems()
    {
        RegisterHelper.registerItem(itemRubber);
    }
}
