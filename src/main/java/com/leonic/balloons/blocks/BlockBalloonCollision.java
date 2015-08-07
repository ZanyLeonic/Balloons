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

public class BlockBalloonCollision extends Block {
	
	private static String colourm8;
	
	public BlockBalloonCollision(String name, String colour){
		super(Material.cloth);
		setHardness(1.0F);
		setResistance(1.0F);
		setBlockTextureName(name);
		setBlockName(name);
		colourm8 = colour;
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
		if(colourm8 == "black"){
			return BalloonsItems.itemBalloon;
		} else if(colourm8 == "blue"){
			
		}
        
    }
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + "balloon_" + colourm8);
	}
	
}
