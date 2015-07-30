package com.leonic.balloons.init;

import com.leonic.balloons.helpers.RegisterHelper;
import com.leonic.balloons.items.ItemRubber;

import net.minecraft.item.Item;

public class BalloonsItems {

    public static Item itemRubber = new ItemRubber("rubber");

    public static void registerItems()
    {
        RegisterHelper.registerItem(itemRubber);
    }
}
