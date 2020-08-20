package com.aninda.practice.structural.proxy;

public class CarProxy extends Car {

	public CarProxy(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		if(super.driver.getAge() > 18)
			super.drive();
		else
			System.out.println("The Driver must be above 18 years of age to drive this car");
	}

}
