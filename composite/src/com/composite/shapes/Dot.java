package com.composite.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Dot extends BaseShape {
	private final int DOT_SIZE = 3;
	
	public Dot(int x, int y, Color color) {
		super(x, y, color);
	}
	
	@Override
	public int getWidth() {
		return DOT_SIZE;
	}
	
	@Override
	public int getHeigth() {
		return DOT_SIZE;
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.fillRect(x - 1, y - 1, getWidth(), getHeigth());
	}
}
