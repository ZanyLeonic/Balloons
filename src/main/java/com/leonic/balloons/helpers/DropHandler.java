package com.leonic.balloons.helpers;

import java.util.Random;

import com.leonic.balloons.init.BalloonsItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class DropHandler
{
	public static Random random;
	public static int dropped;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event)
	{
		random = new Random();
		dropped = random.nextInt(2) + 1; //DO NOT CHANGE THIS

		if(event.entityLiving instanceof EntitySheep)
		{
				event.entityLiving.entityDropItem(new ItemStack(BalloonsItems.itemRubber), dropped);
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
				event.entityLiving.entityDropItem(new ItemStack(BalloonsItems.itemRubber), dropped);
		}
	}
}