package com.leonic.balloons.items;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;

import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
/**
 * Some random record.
 * @author Leonic
 * @version 1.8-0.1
 */
public class DropIt extends ItemRecord
{
	@SuppressWarnings("rawtypes")
	private static final Map records = new HashMap();


	public String recordName;


	public DropIt(String recordName)
	{
		super(recordName);
		setCreativeTab(Balloons.balloons);
		setUnlocalizedName("record");
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		IBlockState iblockstate = world.getBlockState(pos);
		
		//TODO: world.getBlock()
		if (iblockstate.getBlock() == Blocks.jukebox && !((Boolean)iblockstate.getValue(BlockJukebox.HAS_RECORD)).booleanValue())
		{
			if (world.isRemote)
				return true;
			else
			{
				((BlockJukebox)Blocks.jukebox).insertRecord(world, pos, iblockstate, stack);
                world.playAuxSFXAtEntity((EntityPlayer)null, 1005, pos, Item.getIdFromItem(this));
                --stack.stackSize;
                return true;
			}
		}else
			return false;
	}


	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add(this.getRecordNameLocal());
	}


	@Override
	//TODO: getRecordTitle()
	public String getRecordNameLocal()
	{
		return StatCollector.translateToLocal(this.getUnlocalizedName() + ".desc");
	}


	@Override
	public EnumRarity getRarity(ItemStack itemStack)
	{
		return EnumRarity.RARE;
	}


	public static DropIt getRecord(String par0Str)
	{
		return (DropIt)records.get(par0Str);
	}


	@Override
	public ResourceLocation getRecordResource(String name)
	{
		return new ResourceLocation(References.MODID, name);
	}
}
