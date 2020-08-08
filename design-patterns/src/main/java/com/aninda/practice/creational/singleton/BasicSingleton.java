package com.aninda.practice.creational.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
	private static final BasicSingleton instance = new BasicSingleton();
	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private BasicSingleton() {
		System.out.println("Initializing Singleton");
	}
	
	public static BasicSingleton getInstance() {
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
}
