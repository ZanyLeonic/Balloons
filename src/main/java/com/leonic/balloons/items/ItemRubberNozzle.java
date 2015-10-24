package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;

import net.minecraft.item.Item;

/**
 * The Item class of the RubberNozzle
 * @author ZanyLeonic
 * @version 1.8-0.1
 */
public class ItemRubberNozzle extends Item {
	/**
	 * The main method for the ItemRubberNozzle
	 * @param name Sets the UnlocalizedName and TextureName.
	 */
	public ItemRubberNozzle(String name) {
		super();
		setCreativeTab(Balloons.balloons);
		setUnlocalizedName(name);
	}
}
