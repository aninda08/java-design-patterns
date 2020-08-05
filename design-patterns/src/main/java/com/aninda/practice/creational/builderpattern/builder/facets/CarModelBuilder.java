package com.aninda.practice.creational.builderpattern.builder.facets;

import com.aninda.practice.creational.builderpattern.builder.CarBuilder;
import com.aninda.practice.creational.builderpattern.model.Vehicle;

public class CarModelBuilder extends CarBuilder {

	public CarModelBuilder(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
		// TODO Auto-generated constructor stub
	}
	
	public CarModelBuilder withName(String name) {
		vehicle.setName(name);
		return this;
	}
	
	public CarModelBuilder vehicleType(String type) {
		vehicle.setType(type);
		return this;
	}
	
	public CarModelBuilder from(String brand) {
		vehicle.setBrand(brand);
		return this;
	}
	
	public CarModelBuilder at(long price) {
		vehicle.setPrice(price);
		return this;
	}

}
