package com.aninda.practice;

import com.aninda.practice.creational.abstractfactory.BaseFactory;
import com.aninda.practice.creational.abstractfactory.BaseFactory.AvailableProduct;
import com.aninda.practice.creational.abstractfactory.IProduct;
import com.aninda.practice.creational.factory.ShapeFactory;
import com.aninda.practice.creational.factory.model.Shape;
import com.aninda.practice.creational.factory.model.ShapeType;

/**
 * Builder Patterns imports
 * 
 * import com.aninda.practice.creational.builderpattern.builder.CarBuilder;
 * import com.aninda.practice.creational.builderpattern.builder.EmployeeBuilder;
 * import com.aninda.practice.creational.builderpattern.builder.PersonBuilder;
 * import com.aninda.practice.creational.builderpattern.model.Person;
 * import com.aninda.practice.creational.builderpattern.model.Vehicle;
 * */

/**
 * Design Patterns Demo implementations
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	/**
    	 * -----------------Builder patterns----------------
    	 */
    	
    	/**
    	 * Fluent Builder with recursive generics
    	 * 
    	 * Person person = new EmployeeBuilder().withName("Aninda").workAs("SMTS").build();
         * System.out.println(person);
    	 */
    	
    	/**
    	 * Facets Builder
    	 * 
    	 * Vehicle vehicle = new CarBuilder()
    	 * 		.model()
    	 * 			.from("Honda")
    	 * 			.withName("Amaze")
    	 * 			.vehicleType("Sedan")
    	 * 			.at(700000)
    	 * 		.feature()
    	 * 			.capacity(5)
    	 * 			.mileage(14)
    	 * 			.poweredBy("petrol")
    	 * 		.build();
    	 * System.out.println(vehicle);
    	 */
    	
    	/**
    	 * ---------------Factory patterns----------------
    	 */
    	
    	/**
    	 * Factory method pattern
    	 * 
    	 * Shape shape = ShapeFactory.getInstance(ShapeType.CIRCLE, 100, 40);
    	 * System.out.println(shape);
    	 */
    	
    	/**
    	 * Abstract Factory
    	 * IProduct product = new BaseFactory().produce(AvailableProduct.LAPTOP);
    	 * product.consume();
    	 */
    	
    	
    	
    }
}
