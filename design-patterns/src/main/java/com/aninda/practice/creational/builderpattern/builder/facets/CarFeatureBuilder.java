package com.aninda.practice.creational.builderpattern.builder.facets;

import com.aninda.practice.creational.builderpattern.builder.CarBuilder;
import com.aninda.practice.creational.builderpattern.model.Vehicle;

public class CarFeatureBuilder extends CarBuilder {

	public CarFeatureBuilder(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	public CarFeatureBuilder poweredBy(String fuelType) {
		vehicle.setFuelType(fuelType);
		return this;
	}
	
	public CarFeatureBuilder capacity(int capacity) {
		vehicle.setCapacity(capacity);
		return this;
	}
	
	public CarFeatureBuilder mileage(int mileage) {
		vehicle.setMileage(mileage);
		return this;
	}
}
