package com.leonic.balloons.items;

import com.leonic.balloons.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRubber extends Item {
	public ItemRubber(String name) {
	super();
    this.setCreativeTab(CreativeTabs.tabMisc);
    this.setUnlocalizedName(name);
    this.setTextureName(References.MODID + ":" + name);
	}

}
 