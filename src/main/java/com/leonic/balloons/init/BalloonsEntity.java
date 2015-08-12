package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.References;
import com.leonic.balloons.entity.EntityBalloon;

import cpw.mods.fml.common.registry.EntityRegistry;

public class BalloonsEntity {
	
	
	public static void registerEntities(){
		EntityRegistry.registerModEntity(EntityBalloon.class, "Bunch of Balloons", References.ENTITY_BALLOONS_ID, Balloons.instance, 64, 1, true);
	}
}
