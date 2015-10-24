package com.leonic.balloons.helpers;


import org.apache.logging.log4j.Level;

import com.leonic.balloons.References;

import net.minecraftforge.fml.common.FMLLog;


/**
 * LogHelper prints information to the log and the console. 
 * @author ZanyLeonic
 * @version 1.8-0.1
 * 
 * 
 */
public class LogHelper 
{
	
	/**
	 * Main log method.
	 * 
	 * @param logLevel [Level] Log level
	 * @param object [Object] Anything strings or stacktraces.
	 * 
	 */
    public static void log(Level logLevel, Object object){
    	FMLLog.log(References.NAME, logLevel, String.valueOf(object));
    	}
    
    /**
     * All events should be logged.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void all(Object object) {
    	log(Level.ALL, object);
    	}
    
    /**
     * A general debugging event.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void debug(Object object){
    	log(Level.DEBUG, object);
    	}
    
    /**
     * An error in Application, possibly recoverable.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void error(Object object){
    	log(Level.ERROR, object);
    	}
    
    /**
     * A serve error which will crash the game.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void fatal(Object object){
    	log(Level.FATAL, object);
    	} 
    
    /**
     * An event for informal purposes.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void info(Object object){
    	log(Level.INFO, object);
    	}
    
    /**
     * No events will be logged.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void off(Object object){
    	log(Level.OFF, object);
    	} 
    
    /**
     * A fine grained debug message, typically capturing the flow of the application.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void trace(Object object){
    	log(Level.TRACE, object);
    	} 
    
    /**
     * An event that possibly lead to an error.
     * 
     * @param object [Object] Anything strings or stacktraces.
     * 
     */
    public static void warn(Object object){
    	log(Level.WARN, object);
    	}
}