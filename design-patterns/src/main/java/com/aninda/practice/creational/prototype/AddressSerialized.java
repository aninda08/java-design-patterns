package com.aninda.practice.creational.prototype;

import java.io.Serializable;

public class AddressSerialized implements Serializable {
	private String streetName, city, country;

	public AddressSerialized(String streetName, String city, String country) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.country = country;
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
		return "AddressSerialized [streetName=" + streetName + ", city=" + city + ", country=" + country + "]";
	}
	
}
