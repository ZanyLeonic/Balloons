package com.leonic.balloons.blocks;

import java.util.Random;

import com.leonic.balloons.References;
import com.leonic.balloons.init.BalloonsItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockBalloonBlackCollision extends Block {
	public BlockBalloonBlackCollision(String name){
		super(Material.cloth);
		setHardness(1.0F);
		setResistance(1.0F);
		setBlockName(name);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metaData) {
		if(!world.isRemote){
			if(world.blockExists(x, y-1, z)){
				world.setBlock(x, y-1, z, Blocks.air);
			}
		}
		
	}
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return BalloonsItems.itemBalloon;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + "balloon_black");
	}
	
}
