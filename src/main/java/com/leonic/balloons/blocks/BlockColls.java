package com.leonic.balloons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * BlockColls is not a visible block. 
 * It is used by {@link com.Leonic.Balloons.blocks.BlockBalloon} as a collision block
 *  for the Balloon model since it can't fit one block.
 * 
 * @author Leonic
 * @version 0.1
 */
public class BlockColls extends Block {

	public BlockColls(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

}
