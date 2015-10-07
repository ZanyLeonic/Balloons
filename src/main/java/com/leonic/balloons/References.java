package com.leonic.balloons;
/**
 * A class that holds most of the most used strings in this mod.
 * @author ZanyLeonic
 * @version 0.21
 * 
 */
public class References {
	/**
	 * The mods' MODID for Forge.
	 */
	public static final String MODID = "bm";
	
	/**
	 * A more UI friendly name to show up in the Mods list.
	 */
    public static final String NAME = "Balloons Mod";
    
    /**
     * The version of the Mod.
     */
    public static final String VERSION = "1.7.10-0.21";
    
    /**
     * The location of the CommonProxy.
     */
    public static final String COMMON_PROXY = "com.leonic.balloons.proxies.CommonProxy";
    
    /**
     * The location of the ClientProxy.
     */
    public static final String CLIENT_PROXY = "com.leonic.balloons.proxies.ClientProxy";
    
    /**
     * Bunch of Balloons Entity id (Changeable in config.)
     */
    public static int ENTITY_BALLOONS_ID = 580;
    
    /**
     * Allows this mod to integrate with IC2 (Changeable in config.)
     */
    public static boolean ALLOW_IC2_INTERGRATION = true;
    
    /**
     * If set to true, notifies the user about any new versions. (Changeable in config.)
     */
    public static boolean NOTIFY_FOR_NEW_VERSION = true;
    
    /**
     * If set to true, checks for updates on startup. (Changeable in config.)
     */
    public static boolean CHECK_FOR_UPDATES = true;
    
}
