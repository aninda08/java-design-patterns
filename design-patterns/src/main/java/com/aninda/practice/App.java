package com.aninda.practice;

import com.aninda.practice.creational.builderpattern.builder.CarBuilder;
import com.aninda.practice.creational.builderpattern.builder.EmployeeBuilder;
import com.aninda.practice.creational.builderpattern.builder.PersonBuilder;
import com.aninda.practice.creational.builderpattern.model.Person;
import com.aninda.practice.creational.builderpattern.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//simple PersonBuilder
        //Person person = new PersonBuilder().withName("Aninda").build();
    	
//    	Person person = new EmployeeBuilder().withName("Aninda").workAs("SMTS").build();
//        
//        System.out.println(person);
        
        //Facets VehicleBuilder
        Vehicle vehicle = new CarBuilder()
        		.model()
        			.from("Honda")
        			.withName("Amaze")
        			.vehicleType("Sedan")
        			.at(700000)
        		.feature()
        			.capacity(5)
        			.mileage(14)
        			.poweredBy("petrol")
        		.build();
        
        System.out.println(vehicle);
    }
}
