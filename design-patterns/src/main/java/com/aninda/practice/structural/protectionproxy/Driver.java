package com.aninda.practice.structural.protectionproxy;

public class Driver {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Driver(int age) {
		super();
		this.age = age;
	}
	
}
