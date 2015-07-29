package com.leonic.balloons.blocks;

import com.leonic.balloons.References;
import com.leonic.balloons.init.BalloonsCTab;
import com.leonic.balloons.tileentities.TileEntityBalloonBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBalloon extends BlockContainer {
	CreativeTabs BalloonsCTab = new BalloonsCTab("BalloonsCTab");
	public BlockBalloon(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		
		this.setCreativeTab(BalloonsCTab);
	
	}
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return true;	
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityBalloonBlock();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}