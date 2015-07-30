package com.leonic.balloons;

import java.util.Random;

import com.leonic.balloons.items.ItemRubber;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraft.entity.monster.*;

public class DropHandler
{
	public static Random random;
	public static int dropped;
	public static Item itemRubber = new ItemRubber("rubber");

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event)
	{
		random = new Random();
		dropped = random.nextInt(2) + 1; //DO NOT CHANGE THIS

		if(event.entityLiving instanceof EntitySheep)
		{
				event.entityLiving.entityDropItem(new ItemStack(itemRubber), dropped);
		}
		/*
		if(event.entityLiving instanceof EntityZombie)
		{
				event.entityLiving.entityDropItem(new ItemStack(itemRubber), dropped);
		}

		if(event.entityLiving instanceof EntitySpider)
		{
				event.entityLiving.entityDropItem(new ItemStack(itemRubber), dropped);
		}
		*/
		
		if(event.entityLiving instanceof EntityCreeper)
		{
				event.entityLiving.entityDropItem(new ItemStack(itemRubber), dropped);
		}
	}
}