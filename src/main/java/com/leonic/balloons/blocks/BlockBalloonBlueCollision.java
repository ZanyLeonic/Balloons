package com.leonic.balloons.blocks;

import com.leonic.balloons.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockBalloonBlueCollision extends Block {
	public BlockBalloonBlueCollision(String name){
		super(Material.cloth);
		setHardness(1.0F);
		setResistance(1.0F);
		setBlockName(name);
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + "balloon_black");
	}
}
