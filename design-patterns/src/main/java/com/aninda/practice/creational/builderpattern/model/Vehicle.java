package com.aninda.practice.creational.builderpattern.model;

public class Vehicle {
	//Model
	private String name, type, brand;
	private long price;
	
	//Feature
	private String fuelType;
	private int capacity, mileage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", brand=" + brand + ", price=" + price + ", fuelType="
				+ fuelType + ", capacity=" + capacity + ", mileage=" + mileage + "]";
	}
	
}
