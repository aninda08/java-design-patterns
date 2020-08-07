package com.aninda.practice.creational.prototype;

public class PersonCopy {
	private String name;
	private AddressCopy address;
	
	public PersonCopy(String name, AddressCopy address) {
		super();
		this.name = name;
		this.address = address;
	}
	public PersonCopy(PersonCopy other) {
		this(other.name, new AddressCopy(other.address));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressCopy getAddress() {
		return address;
	}
	public void setAddress(AddressCopy address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonCopy [name=" + name + ", address=" + address + "]";
	}
	
}
