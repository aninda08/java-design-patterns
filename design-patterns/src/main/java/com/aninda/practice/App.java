package com.aninda.practice;

import com.aninda.practice.creational.prototype.AddressClone;
import com.aninda.practice.creational.prototype.AddressCopy;
import com.aninda.practice.creational.prototype.AddressSerialized;
import com.aninda.practice.creational.prototype.PersonClone;
import com.aninda.practice.creational.prototype.PersonCopy;
import com.aninda.practice.creational.prototype.PersonSerialized;
import org.apache.commons.lang3.SerializationUtils;

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
 * Factory pattern imports
 * 
 * import com.aninda.practice.creational.factory.ShapeFactory;
 * import com.aninda.practice.creational.factory.model.Shape;
 * import com.aninda.practice.creational.factory.model.ShapeType;
 */

/**
 * Abstract Factory Pattern imports
 * 
 * import com.aninda.practice.creational.abstractfactory.BaseFactory;
 * import com.aninda.practice.creational.abstractfactory.BaseFactory.AvailableProduct;
 * import com.aninda.practice.creational.abstractfactory.IProduct;
 */

/**
 * Design Patterns Demo implementations
 *
 */
public class App 
{
    /**
     * @param args
     * @throws Exception
     */
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
    	 * 
    	 * IProduct product = new BaseFactory().produce(AvailableProduct.LAPTOP);
    	 * product.consume();
    	 */
    	
    	/**
    	 * ------------------Prototype patterns-----------------------
    	 */
    	
    	/**
    	 * Cloneable prototyping
    	 * 
    	 * PersonClone person1 = new PersonClone("Aninda", new AddressClone("R.N.T.P Bye Lane", "Shyamangar", "India"));
    	 * PersonClone person2 = (PersonClone)person1.clone();
    	 * person2.setName("Sumit");
    	 * person2.getAddress().setStreetName("BN Bose Lane");
    	 * person2.getAddress().setCity("kolkata");
    	 * System.out.println(person1);
    	 * System.out.println(person2);
    	 */
    	
    	/**
    	 * Copy constructor prototyping
    	 * 
    	 * PersonCopy person1 = new PersonCopy("Aninda", new AddressCopy("R.N.T.P Bye Lane", "Shyamangar", "India"));
    	 * PersonCopy person2 = new PersonCopy(person1);
    	 * person2.setName("Sumit");
    	 * person2.getAddress().setStreetName("BN Bose Lane");
    	 * person2.getAddress().setCity("kolkata");
    	 * System.out.println(person1);
    	 * System.out.println(person2);
    	 */
    	
    	/**
    	 * Serializable prototyping
    	 * 
    	 * PersonSerialized person1 = new PersonSerialized("Aninda", new AddressSerialized("R.N.T.P Bye Lane", "Shyamangar", "India"));
    	 * PersonSerialized person2 = SerializationUtils.roundtrip(person1);
    	 * person2.setName("Sumit");
    	 * person2.getAddress().setStreetName("BN Bose Lane");
    	 * person2.getAddress().setCity("kolkata");
    	 * System.out.println(person1);
    	 * System.out.println(person2);
    	 */
    	
    	
    }
}
