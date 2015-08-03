package com.leonic.balloons.helpers;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.leonic.balloons.References;

public class UpdateHelper {
	
	private static String currentVersion = References.VERSION;
	private static String newestVersion;
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
					updateStatus = "§6§l[Balloons]§r§c out of date! Your version: " + currentVersion + " §6§lLatest version: §r" + newestVersion;
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
			newestVersion = newestVersion + " " + s.next();
			s.close();
		}catch(IOException ex) {
			ex.printStackTrace();
			LogHelper.error("Could not connect to determine if mod was up to date!");
		}
	}
}