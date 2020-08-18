package com.aninda.practice.structural.decorator.dynamic;

import java.util.function.Supplier;

public class StaticTransparentShape<T extends IShape> implements IShape {
	private IShape shape;
	private int transparency;
	public StaticTransparentShape(Supplier<? extends T> ctor, int transparency) {
		shape = ctor.get();
        this.transparency = transparency;
	}
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return shape.info() + " has transparency of " + this.transparency + "%";
	}

}
