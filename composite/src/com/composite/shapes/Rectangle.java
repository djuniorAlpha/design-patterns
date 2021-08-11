package com.composite.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends BaseShape {
	public int width;
	public int heigth;
	
	public Rectangle(int x, int y, int width, int heigth, Color color) {
		super(x, y, color);
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public int getWidth() {
		return width;
	}
	
	@Override
	public int getHeigth() {
		return heigth;
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawRect(x, y, getWidth() - 1, getHeigth() - 1);
	}
}
