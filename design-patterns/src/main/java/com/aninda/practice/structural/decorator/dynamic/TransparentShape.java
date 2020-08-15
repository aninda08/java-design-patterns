package com.aninda.practice.structural.decorator.dynamic;

/**
 * Decorated new version
 * @author Aninda
 *
 */
public class TransparentShape implements IShape {
	private IShape shape;
	private int transparency;
	
	public TransparentShape(IShape shape, int transparency) {
		super();
		this.shape = shape;
		this.transparency = transparency;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return shape.info() + " has transparency of " + this.transparency + "%";
	}

}
