package com.aninda.practice.creational.prototype;

import java.io.Serializable;

public class PersonSerialized implements Serializable {
	private String name;
	private AddressSerialized address;
	public PersonSerialized(String name, AddressSerialized address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressSerialized getAddress() {
		return address;
	}
	public void setAddress(AddressSerialized address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonSerialized [name=" + name + ", address=" + address + "]";
	}
	
}
