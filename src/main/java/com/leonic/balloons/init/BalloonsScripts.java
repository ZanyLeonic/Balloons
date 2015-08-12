package com.leonic.balloons.init;

import java.io.IOException;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.leonic.balloons.Balloons;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.nbt.NBTTagCompound;

public class BalloonsScripts {
	
	/**
	 * Runs the Minetweaker scripts
	 */
	public static void runScripts(){
		if (Loader.isModLoaded("MineTweaker3")) {
		    try {
		        String data = Resources.toString(Resources.getResource(Balloons.class, "/scripts/balloons.zs"), Charsets.UTF_8);
		        NBTTagCompound nbtData = new NBTTagCompound();
		        nbtData.setString("name", "balloons_recipes.zs");
		        nbtData.setString("content", data);
		        FMLInterModComms.sendMessage("MineTweaker3", "addMineTweakerScript", nbtData);
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
		}
	
	}
}
