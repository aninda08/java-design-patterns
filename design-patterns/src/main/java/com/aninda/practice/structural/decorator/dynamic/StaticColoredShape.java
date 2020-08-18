package com.aninda.practice.structural.decorator.dynamic;

import java.util.function.Supplier;

public class StaticColoredShape<T extends IShape> implements IShape {
	private IShape shape;
	private String color;
	public StaticColoredShape(Supplier<? extends T> ctor, String color) {
		shape = ctor.get();
        this.color = color;
	}
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return shape.info() + " has color " + this.color;
	}
}
