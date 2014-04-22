package shiftgame;

import java.awt.Color;

public class Box {
	private Color BoColor;
	private int height, width;
	public Box (Color c) {
		BoColor=c;
	}
	public Color getBoColor() {
		return BoColor;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setBoColor(Color boColor) {
		BoColor = boColor;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
