package com.leonic.balloons.helpers;

public class ColourHelper {
	
	/**
	 * Processes every Colour in Minecraft from a number to a string.
	 * @param Colour
	 * @return Balloon Colour
	 */
	public static String BalloonColour(int Colour) {
		if(Colour == 0){
			return "white";
		}else if(Colour == 1){
			return "red";
		}else if (Colour == 2){
			return "orange";
		}else if (Colour == 3){
			return "yellow";
		}else if (Colour == 4){
			return "lime";
		}else if (Colour == 5){
			return "green";
		}else if (Colour == 6){
			return "cyan";
		}else if (Colour == 7){
			return "dblue";
		}else if (Colour == 8){
			return "blue";
		}else if (Colour == 9){
			return "purple";
		}else if (Colour == 10){
			return "magenta";
		}else if (Colour == 11){
			return "pink";
		}else if (Colour == 12){
			return "lgrey";
		}else if (Colour == 13){
			return "grey";
		}else if (Colour == 14){
			return "black";
		}else if (Colour == 15){
			return "brown";
		}else{
			return "white";
		}
	}
}
