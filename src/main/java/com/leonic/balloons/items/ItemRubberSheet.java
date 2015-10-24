package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;

import net.minecraft.item.Item;

/**
 * The Item class of Rubber Sheets.
 * @author ZanyLeonic
 * @version 1.8-0.1
 */
public class ItemRubberSheet extends Item {
	
	/**
	 * The Rubber sheet Item.
	 * @param name Sets the Unlocalized name for the item and the Texture name.
	 */
	public ItemRubberSheet(String name){
		super();
		setCreativeTab(Balloons.balloons);
		setUnlocalizedName(name);
	}
}
