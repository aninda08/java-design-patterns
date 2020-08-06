package com.aninda.practice.creational.factory.model;

public class Shape {
	protected double area;
	protected double perimeter;
	public Shape(double area, double perimeter) {
		super();
		this.area = area;
		this.perimeter = perimeter;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Shape [area=" + area + ", perimeter=" + perimeter + "]";
	}
}
