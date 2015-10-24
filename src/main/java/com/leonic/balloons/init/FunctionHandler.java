package com.leonic.balloons.init;

import net.minecraftforge.fml.common.Loader;

/**
 * Holds all the optional functions
 * @author ZanyLeonic
 * @version 1.8-0.1
 */
public class FunctionHandler {

	/**
	 * A simple method that checks if a mod is loaded by their MODID.
	 * @param MODID Mods ID
	 * @return true if mod is install false if not.
	 */
	public static boolean isModLoaded(String MODID) {
		if(Loader.isModLoaded(MODID)){
			return true;
		}else{
			return false;
		}
	}
	
}
