package com.aninda.practice.structural.proxy;

public class Car implements IDrivable {
	protected Driver driver;
	
	public Car(Driver driver) {
		super();
		this.driver = driver;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The Car is driven");
	}

}
