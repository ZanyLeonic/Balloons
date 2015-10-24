package com.leonic.balloons.helpers;

import java.util.Random;

import com.leonic.balloons.init.BalloonsItems;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler
{
	public static double rand;
	public Random r = new Random();

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		
		if(event.entityLiving instanceof EntityCreeper) {
			event.entityLiving.dropItem(BalloonsItems.itemRubber, r.nextInt(2));
		}
		
		if(event.entityLiving instanceof EntityWitch) {
			event.entityLiving.dropItem(BalloonsItems.itemRubber, r.nextInt(2));
		}
		
	}
}