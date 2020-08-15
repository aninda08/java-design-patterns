package com.aninda.practice.structural.decorator.dynamic;

/**
 * Old version
 * @author Aninda
 *
 */
public class Circle implements IShape {
	private float radius;
	
	public Circle() {
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public void resize(float factor) {
		this.radius *= factor;
	}
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "This is a circle with radius " + this.radius + " cm";
	}

}
