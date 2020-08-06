package com.aninda.practice.creational.factory;

import com.aninda.practice.creational.factory.model.Circle;
import com.aninda.practice.creational.factory.model.Shape;
import com.aninda.practice.creational.factory.model.ShapeType;
import com.aninda.practice.creational.factory.model.Square;

public class ShapeFactory {
	public static Shape getInstance(ShapeType type, double area, double perimeter) {
		if(type == ShapeType.SQUARE)
			return new Square(area, perimeter, type.toString());
		else if(type == ShapeType.CIRCLE)
			return new Circle(area, perimeter, type.toString());
		else
			return null;
	}

}
