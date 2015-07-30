package com.leonic.balloons.blocks;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import com.leonic.balloons.tileentities.TileEntityBalloonBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
/*
 * @author ZanyLeonic
 * The Block class for the Balloon.
 * 
 */
public class BlockBalloon extends BlockContainer {
	/*
	 * Block Balloon
	 * 
	 * @param Material [material] Sets the material of the block. Usually material.cloth.
	 * 
	 */
	public BlockBalloon(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		
		this.setCreativeTab(Balloons.balloons);
	
	}
	@Override
	public int getRenderType() {
		return -1;
	}
	@Override
	public boolean isOpaqueCube(){
		return false;	
	}
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public boolean isFullCube()
	{
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
