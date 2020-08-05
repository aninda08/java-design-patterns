package com.aninda.practice.creational.builderpattern.builder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
	public EmployeeBuilder workAs(String position) {
		person.setPosition(position);
		return self();
	}
	
	protected EmployeeBuilder self() {
		return this;
	}
}
