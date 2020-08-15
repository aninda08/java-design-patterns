package com.aninda.practice;

import com.aninda.practice.structural.decorator.MagicString;
import com.aninda.practice.structural.decorator.dynamic.Circle;
import com.aninda.practice.structural.decorator.dynamic.ColoredShape;
import com.aninda.practice.structural.decorator.dynamic.Square;
import com.aninda.practice.structural.decorator.dynamic.TransparentShape;

/**
 * Composite pattern imports
 * 
 * import com.aninda.practice.structural.composite.Circle;
 * import com.aninda.practice.structural.composite.GraphicObject;
 * import com.aninda.practice.structural.composite.Neuron;
 * import com.aninda.practice.structural.composite.NeuronLayer;
 * import com.aninda.practice.structural.composite.Square;
 */

/**
 * Bridge patterns imports
 * 
 * import com.aninda.practice.structural.bridge.abstraction.APayment;
 * import com.aninda.practice.structural.bridge.concreteimplementor.CitiPaymentSystem;
 * import com.aninda.practice.structural.bridge.refinedabstraction.CardPayment;
 */

/**
 * Adapter pattern imports
 * 
 * import com.aninda.practice.structural.adapter.IShape;
 * import com.aninda.practice.structural.adapter.Line;
 * import com.aninda.practice.structural.adapter.LineAdapter;
 * import com.aninda.practice.structural.adapter.Rectangle;
 * import com.aninda.practice.structural.adapter.RectangleAdapter; 
 */

/**
 * Structural Design pattern Demo Implementation
 * @author Aninda
 *
 */
public class StructuralPatternsDemoApp {

	public static void main(String[] args) {
		
		/**
		 * ---------------Adapter Patterns------------------------
		 * 
		 * IShape[] shapes = {
		 * 	new LineAdapter(new Line()),
		 * 	new RectangleAdapter(new Rectangle())
		 * };
		 * int x1 = 10, y1 = 20;
		 * int x2 = 30, y2 = 60;
		 * for (IShape shape : shapes)
		 * 	shape.draw(x1, y1, x2, y2);
		 */
		
		/**
		 * ----------------Bridge Patterns------------------------
		 * 
		 * APayment order = new CardPayment();
		 * order._IPaymentSystem = new CitiPaymentSystem();
		 * order.makePayment();
		 */
		
		/**
		 * ----------------Composite Patterns---------------------
		 */
		
		/**
		 * Simple Composition
		 * 
		 * GraphicObject drawing = new GraphicObject();
		 * drawing.setName("My Drawing");
		 * drawing.children.add(new Square("Red"));
		 * drawing.children.add(new Circle("Yellow"));
		 * GraphicObject group = new GraphicObject();
		 * group.children.add(new Circle("Blue"));
		 * group.children.add(new Square("Blue"));
		 * drawing.children.add(group);
		 * System.out.println(drawing);
		 */
		
		/**
		 * Neural Network
		 * 
		 * Neuron neuron = new Neuron();
		 * Neuron neuron2 = new Neuron();
		 * NeuronLayer layer = new NeuronLayer();
		 * NeuronLayer layer2 = new NeuronLayer();
		 * neuron.connectTo(neuron2);
		 * neuron.connectTo(layer);
		 * layer.connectTo(neuron);
		 * layer.connectTo(layer2);
		 */
		
		/**
		 * ------------------Decorator Patterns-----------------------
		 */
		
		/**
		 * Simple String decorator pattern
		 * This demostrate the delegation of methods as String cannot be inherited since final class  
		 * 
		 * MagicString s = new MagicString("String decorator Pattern");
		 * System.out.println(s + " has " + s.getNumberOfVowels() + " vowels");
		 */
		
		/**
		 * Dynamic Decorator pattern
		 * 
		 * Circle circle = new Circle(10);
		 * ColoredShape coloredSquare = new ColoredShape(new Square(15),"red");
		 * TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(20),"blue"),50);
		 * System.out.println(circle.info() + "\n" + coloredSquare.info() + "\n" + myCircle.info());
		 */
		
	}

}
