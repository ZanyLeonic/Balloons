package com.leonic.balloons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;;

public class BlockBalloonCollisionBase extends Block {

	public BlockBalloonCollisionBase() {
		super(Material.cloth);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
	}

}
