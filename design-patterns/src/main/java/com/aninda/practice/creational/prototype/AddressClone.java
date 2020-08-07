package com.aninda.practice.creational.prototype;

public class AddressClone implements Cloneable {
	private String streetName, city, country;

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

	public AddressClone(String streetName, String city, String country) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new AddressClone(this.streetName, this.city, this.country);
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", country=" + country + "]";
	}
	
}
