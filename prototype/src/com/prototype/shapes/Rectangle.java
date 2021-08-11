package com.prototype.shapes;

public class Rectangle extends Shape {
	public int width;
	public int heigth;
	
	public Rectangle() {}
	
	public Rectangle(Rectangle target) {
		super(target);
		if(target != null) {
			this.width = target.width;
			this.heigth = target.heigth;
		}
	}
	
	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
	
	@Override
	public boolean equals(Object object2) {
		if(!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
		Rectangle shape2 = (Rectangle) object2;
		return shape2.width == width && shape2.heigth == heigth;
	}
}
