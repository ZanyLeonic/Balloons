package com.leonic.balloons.helpers;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.leonic.balloons.References;

public class UpdateHelper {
	
	private static String currentVersion = References.VERSION;
	private static String newestVersion;
	private static String newestVersionURL = null;
	public static String updateURL = null;
	public static String updateStatus = null;
	public static boolean show = false;
	
	public static void init() {
		getNewestVersion();
			if(newestVersion != null) {
				if(newestVersion.equalsIgnoreCase(currentVersion)) {
					updateStatus = "§6§l[Balloons]§r§a is up to date!";
					LogHelper.info("Balloons is up to date!");
				}else {
					show = true;
					getNewestVersionURL();
					updateStatus = "§6§l[Balloons]§r§c There is a new version of Balloons. §6§lYour version:§r " + currentVersion + " §6§lLatest version: §r" + newestVersion;
						if(newestVersionURL != null){
							updateURL = "§6§l[Balloons]§r You can download it at " + newestVersionURL;
						}else{
							updateURL = "§6§l[Balloons]§r Couldn't get link, try http://ZanyLeonic.github.io/Balloons/ .";
						}
					LogHelper.info("Balloons out of date! Your version: " + currentVersion + " Latest version: " + newestVersion);
				}
		}else {
			show = true;
			updateStatus = "§6§l[Balloons]§r§c Failed to connect to check if update are available!";
			LogHelper.error("Failed to connect to check if update are available!");
		}
	}

	private static void getNewestVersion() {
		try {
			URL url = new URL("http://zanyleonic.github.io/Balloons/versions/1.7.10/latest.ver");
			Scanner s = new Scanner(url.openStream());
			newestVersion = s.next();
			s.close();
		}catch(IOException ex) {
			LogHelper.error("Cannot check for latest version. Either GitHub is blocked or connection was closed. Could not connect to determine if mod was up to date!");
			LogHelper.error("Stacktrace:");
			ex.printStackTrace();
		}
	}
	
	private static void getNewestVersionURL() {
		try{
			URL url = new URL("http://zanyleonic.github.io/Balloons/versions/1.7.10/latest.url");
			Scanner scan = new Scanner(url.openStream());
			newestVersionURL = scan.next();
			scan.close();
		}catch(IOException ex) {
			LogHelper.error("Cannot check for latest URL for update. Either GitHub is blocked or connection was closed.");
			LogHelper.error("Stacktrace:");
			ex.printStackTrace();
		}
	}
}