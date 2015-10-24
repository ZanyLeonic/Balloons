package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;

import net.minecraft.item.Item;
/**
 * The Item class for RubberBall
 * @author ZanyLeonic
 * @version 1.8-0.1
 */
public class ItemRubberBall extends Item {

	/**
	 * The main method of ItemRubberBall.
	 * @param name Sets the UnlocalizedName and TextureName.
	 */
	public ItemRubberBall(String name){
		super();
		setCreativeTab(Balloons.balloons);
		setUnlocalizedName(name);
	}
}
