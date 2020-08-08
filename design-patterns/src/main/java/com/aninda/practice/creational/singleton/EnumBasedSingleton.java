package com.aninda.practice.creational.singleton;

public enum EnumBasedSingleton {
	INSTANCE;
	
	EnumBasedSingleton() {
		// TODO Auto-generated constructor stub
		value = 0;
	}
	
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
