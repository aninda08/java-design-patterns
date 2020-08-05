package com.aninda.practice.creational.builderpattern.builder;

import com.aninda.practice.creational.builderpattern.builder.facets.CarFeatureBuilder;
import com.aninda.practice.creational.builderpattern.builder.facets.CarModelBuilder;
import com.aninda.practice.creational.builderpattern.model.Vehicle;

public class CarBuilder {
	protected Vehicle vehicle = new Vehicle();
	
	public CarModelBuilder model() {
		return new CarModelBuilder(vehicle);
	}
	
	public CarFeatureBuilder feature() {
		return new CarFeatureBuilder(vehicle);
	}
	
	public Vehicle build() {
		return vehicle;
	}

}
