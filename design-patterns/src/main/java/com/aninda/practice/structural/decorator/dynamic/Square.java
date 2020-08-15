package com.aninda.practice.structural.decorator.dynamic;

/**
 * Old version
 * @author Aninda
 *
 */
public class Square implements IShape {
	private float side;
	
	public Square(float side) {
		super();
		this.side = side;
	}

	public Square() {
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "This is a square with side " + this.side + " cm";
	}

}
