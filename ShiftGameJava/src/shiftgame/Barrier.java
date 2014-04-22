package shiftgame;

import java.awt.Color;
import java.util.Random;

public class Barrier {
	public Color baColor;
	public int baSpeed;
	
	public int baY;
	public int numTypes=5;
	public static Color[] types= {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.PINK };
	public static Color[] tempTypes = {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.PINK };
	
	public void generate() {
		Random randGen=new Random();
		baColor=tempTypes[randGen.nextInt(numTypes)];
	}
	
	public void move() {
		
	}
	public void destroy() {
		
	}
}
