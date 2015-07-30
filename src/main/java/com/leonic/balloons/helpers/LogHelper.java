package com.leonic.balloons.helpers;


import org.apache.logging.log4j.Level;

import com.leonic.balloons.References;

import cpw.mods.fml.common.FMLLog;

/*
 * @author ZanyLeonic
 * 
 * LogHelper prints information to the log and the console. 
 * 
 */

public class LogHelper 
{
	
	/*
	 * Main log method.
	 * 
	 * @param Level [logLevel] Log level
	 * @param Object [object] Anything strings or stacktraces.
	 * 
	 */
    public static void log(Level logLevel, Object object){
    	FMLLog.log(References.NAME, logLevel, String.valueOf(object));
    	}
    
    /*
     * All events should be logged.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void all(Object object) {
    	log(Level.ALL, object);
    	}
    
    /*
     * A general debugging event.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void debug(Object object){
    	log(Level.DEBUG, object);
    	}
    
    /*
     * An error in Application, possibly recoverable.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void error(Object object){
    	log(Level.ERROR, object);
    	}
    
    /*
     * A serve error which will crash the game.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void fatal(Object object){
    	log(Level.FATAL, object);
    	} 
    
    /*
     * An event for informal purposes.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void info(Object object){
    	log(Level.INFO, object);
    	}
    
    /*
     * No events will be logged.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void off(Object object){
    	log(Level.OFF, object);
    	} 
    
    /*
     * A fine grained debug message, typically capturing the flow of the application.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void trace(Object object){
    	log(Level.TRACE, object);
    	} 
    
    /*
     * An event that possibly lead to an error.
     * 
     * @param Object [object] Anything strings or stacktraces.
     * 
     */
    public static void warn(Object object){
    	log(Level.WARN, object);
    	}
}