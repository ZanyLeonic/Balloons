package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;

import net.minecraft.item.Item;
/**
 * The Item class for RubberBall
 * @author ZanyLeonic
 * @version 0.1
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
		setTextureName(References.MODID + ":" + name);
	}
}
