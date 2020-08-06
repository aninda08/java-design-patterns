package com.aninda.practice.creational.factory.model;

public class Square extends Shape {
	protected String name;

	public Square(double area, double perimeter, String name) {
		super(area, perimeter);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Square [name=" + name + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	
}
