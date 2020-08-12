package com.aninda.practice;

/**
 * Singleton Patterns imports
 * 
 * import java.io.FileInputStream;
 * import java.io.FileOutputStream;
 * import java.io.ObjectInputStream;
 * import java.io.ObjectOutputStream;
 * import java.io.Serializable;
 * import com.aninda.practice.creational.singleton.BasicSingleton;
 * import com.aninda.practice.creational.singleton.EnumBasedSingleton;
 * import com.aninda.practice.creational.singleton.Multiton;
 * import com.aninda.practice.creational.singleton.MultitonType;
 * import com.aninda.practice.creational.singleton.ThreadSafeSingleton;
 */

/**
 * Prototype patterns imports
 *  
 *  import com.aninda.practice.creational.prototype.AddressClone;
 *  import com.aninda.practice.creational.prototype.AddressCopy;
 *  import com.aninda.practice.creational.prototype.AddressSerialized;
 *  import com.aninda.practice.creational.prototype.PersonClone;
 *  import com.aninda.practice.creational.prototype.PersonCopy;
 *  import com.aninda.practice.creational.prototype.PersonSerialized;
 *  import org.apache.commons.lang3.SerializationUtils;
 */

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
 * Creational Design Patterns Demo implementations
 * @author Aninda
 *
 */
public class CreationalPatternsDemoApp
{
    /**
     * @param args
     * @throws Exception
     */
//    public static void main( String[] args ) throws Exception
//    {
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
    	
    	/**
    	 * ---------------Singleton Patterns----------------------
    	 */
    	
    	/**
    	 * Basic Singleton
    	 * 
    	 * BasicSingleton singleton = BasicSingleton.getInstance();
    	 * singleton.setValue(100);
    	 * String fileName = "Singleton.bin";
    	 * saveToFile(singleton, fileName);
    	 * BasicSingleton singleton2 = readFromFile(fileName);
    	 * singleton.setValue(200);
    	 * if(singleton == singleton2)
    	 * 		System.out.println("Both objects are same");
    	 */
    	
    	/**
    	 * Enum Based Singleton
    	 * 
    	 * EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
    	 * singleton.setValue(100);
    	 * String fileName = "Singleton.bin";
    	 * saveToFile(singleton, fileName);
    	 * EnumBasedSingleton singleton2 = readFromFile(fileName);
    	 * singleton.setValue(200);
    	 * if(singleton == singleton2)
    	 * 		System.out.println("Both objects are same");
    	 */
    	
    	/**
    	 * Thread Safe Singleton
    	 * 
    	 * ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance;
    	 * singleton.setValue(100);
    	 * String fileName = "Singleton.bin";
    	 * saveToFile(singleton, fileName);
    	 * ThreadSafeSingleton singleton2 = readFromFile(fileName);
    	 * singleton.setValue(200);
    	 * if(singleton == singleton2)
    	 * 		System.out.println("Both objects are same");
    	 */
    	
    	/**
    	 * Multiton 
    	 * 
    	 * Multiton primary = Multiton.get(MultitonType.PRIMARY);
    	 * Multiton secondary = Multiton.get(MultitonType.SECONDARY);
    	 * Multiton fallback = Multiton.get(MultitonType.FALLBACK);
    	 * primary.setValue(100);
    	 * secondary.setValue(200);
    	 * fallback.setValue(300);
    	 * if((primary == secondary) || (primary == fallback) || (fallback == secondary))
    	 * 	System.out.println("Some objects are same");
    	 * else
    	 * 	System.out.println("All objects are different");
    	 * System.out.println("Primary Singleton value :: " + primary.getValue());
    	 * System.out.println("Secondary Singleton value :: " + secondary.getValue());
    	 * System.out.println("Fallback Singleton value :: " + fallback.getValue());
    	 */
    	
//    }
    
    /*public static void saveToFile(ThreadSafeSingleton singleton, String fileName) throws Exception {
    	try (FileOutputStream fileOut = new FileOutputStream(fileName);
    	         ObjectOutputStream out = new ObjectOutputStream(fileOut))
    	    {
    	      out.writeObject(singleton);
    	    }
    }
    
    public static ThreadSafeSingleton readFromFile(String fileName) throws Exception {
    	try (FileInputStream fileIn = new FileInputStream(fileName);
    	         ObjectInputStream in = new ObjectInputStream(fileIn) )
    	    {
    	      return (ThreadSafeSingleton)in.readObject();
    	    }
    }*/
}
