package com.aninda.practice.creational.prototype;

public class PersonClone implements Cloneable {
	private String name;
	private AddressClone address;
	public PersonClone(String name, AddressClone address) {
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
	public AddressClone getAddress() {
		return address;
	}
	public void setAddress(AddressClone address) {
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new PersonClone(this.name, (AddressClone)this.address.clone());
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}
