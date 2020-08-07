package com.aninda.practice.creational.prototype;

public class AddressCopy {
	private String streetName, city, country;

	public AddressCopy(String streetName, String city, String country) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}
	
	public AddressCopy(AddressCopy other) {
		this(other.streetName, other.city, other.country);
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AddressCopy [streetName=" + streetName + ", city=" + city + ", country=" + country + "]";
	}
	
}
