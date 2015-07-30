package com.leonic.balloons.items;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import net.minecraft.item.Item;
/*
 * @author ZanyLeonic
 * The item class for Rubber for the Balloons mod.
 * 
 */
public class ItemRubber extends Item {
	/*
	 * The Rubber item
	 * 
	 * @param String [name] Put anything. It isn't used by the class at all.
	 */
	public ItemRubber(String name) {
		super();
		this.setCreativeTab(Balloons.balloons);
		this.setUnlocalizedName("rubber");
		this.setTextureName(References.MODID + ":" + "rubber");
	}

}
 