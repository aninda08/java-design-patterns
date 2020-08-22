package com.aninda.practice;

/**
 * Proxy pattern import
 * 
 * import com.aninda.practice.structural.proxy.Car;
 * import com.aninda.practice.structural.proxy.CarProxy;
 * import com.aninda.practice.structural.proxy.Creature;
 * import com.aninda.practice.structural.proxy.Driver;
 * import com.aninda.practice.structural.proxy.IHuman;
 * import com.aninda.practice.structural.proxy.LoggingHandler;
 * import com.aninda.practice.structural.proxy.Person;
 */

/**
 * Flyweight pattern import
 * 
 * import com.aninda.practice.structural.flyweight.User;
 */

/**
 * Decorator pattern imports
 * 
 * import com.aninda.practice.structural.decorator.MagicString;
 * import com.aninda.practice.structural.decorator.dynamic.Circle;
 * import com.aninda.practice.structural.decorator.dynamic.ColoredShape;
 * import com.aninda.practice.structural.decorator.dynamic.Square;
 * import com.aninda.practice.structural.decorator.dynamic.StaticColoredShape;
 * import com.aninda.practice.structural.decorator.dynamic.StaticTransparentShape;
 * import com.aninda.practice.structural.decorator.dynamic.TransparentShape;
 */

/**
 * Facade pattern imports
 * 
 * import com.aninda.practice.structural.facade.Buffer;
 * import com.aninda.practice.structural.facade.Console;
 * import com.aninda.practice.structural.facade.Viewport;
 */

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
		
		/**
		 * Static Decorator pattern
		 * 
		 * Circle circle = new Circle(10);
		 * System.out.println(circle.info());
		 * StaticColoredShape<Square> blueSquare = new StaticColoredShape<>(() -> new Square(20), "blue");
		 * System.out.println(blueSquare.info());
		 * StaticTransparentShape<StaticColoredShape<Circle>> myCircle = new StaticTransparentShape<>(() -> new StaticColoredShape<>(() -> new Circle(5), "green"), 50);
		 * System.out.println(myCircle.info());
		 */
		
		/**
		 * ----------------Facade Design patterns-----------------
		 * 
		 * Console console2 = Console.newConsole(30, 20);
		 * console2.render();
		 */
		
		/**
		 * ----------------Flyweight Design Patterns-----------------
		 * 
		 * User user1 = new User("Aninda Chakraborty");
		 * User user2 = new User("Munia Chakraborty");
		 * Both the user share a common memory space for string 'Chakraborty'
		 */
		
		/**
		 * -----------------Proxy Design patterns----------------
		 */
		
		/**
		 * Protection Proxy pattern
		 * 
		 * Driver driver = new Driver(25);
		 * Car car = new CarProxy(driver);
		 * car.drive();
		 */
		
		/**
		 * Property Proxy pattern
		 * 
		 * Creature creature = new Creature();
		 * creature.setAgility(14);
		 * System.out.println("The Creature is of agility " + creature.getAgility());
		 */
		
		/**
		 * Dynamic proxy for logging
		 * 
		 * Person person = new Person();
		 * IHuman logged = LoggingHandler.withLogging(person, IHuman.class);
		 * logged.walk();
		 * logged.talk();
		 * logged.talk();
		 * System.out.println(logged);
		 */
		
		
	}

}
