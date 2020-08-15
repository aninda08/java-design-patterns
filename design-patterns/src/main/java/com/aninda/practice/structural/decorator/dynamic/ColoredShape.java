package com.aninda.practice.structural.decorator.dynamic;

/**
 * Decorated new version
 * @author Aninda
 *
 */
public class ColoredShape implements IShape {
	private IShape shape;
	private String color;
	
	public ColoredShape(IShape shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return shape.info() + " has color " + this.color;
	}

}
