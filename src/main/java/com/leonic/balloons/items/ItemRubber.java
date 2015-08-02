package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import net.minecraft.item.Item;
/**
 * The item class for Rubber for the Balloons mod.
 * 
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class ItemRubber extends Item {
	/**
	 * The Rubber item
	 * 
	 * @param name [String] Put anything. It isn't used by the class at all.
	 */
	public ItemRubber(String name) {
		super();
		this.setCreativeTab(Balloons.balloons);
		this.setUnlocalizedName("rubber");
		this.setTextureName(References.MODID + ":" + "rubber");
	}

}
 