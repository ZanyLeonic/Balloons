package com.leonic.balloons.blocks;

import java.util.Random;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import com.leonic.balloons.items.ItemBlueBalloon;
import com.leonic.balloons.tileentities.TileEntityBalloonBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
/**
 * The Block class for the Balloon.
 * 
 * @author ZanyLeonic
 * @version 0.1
 * 
 */
public class BlockBalloon extends BlockContainer {
	
    public static Item itemBluballoon = new ItemBlueBalloon("bluballoon");	
	/**
	 * Block Balloon
	 * @param material [material] Sets the material of the block. Usually material.cloth.
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
	
	public Item getItemDropped(int p_149650_1_, Random rnd, int p_149650_3_)
    {
        return itemBluballoon;
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
