package com.zamron;

public class CustomAlertInterface {
	
	private int width;
	private int height;
	private int opacity;
	private int color;
	public CustomAlertInterface(int width, int height, int opacity, int color, int scrollWidth, int scrollHeight, int scrollMax) {
		this.width = width;
		this.height = height;
		this.opacity = opacity;
		this.color = color;
	}
	
	void draw() {
		DrawingArea.drawTransparentBox(35, 175, width, height, color, opacity);
		
	}
}
