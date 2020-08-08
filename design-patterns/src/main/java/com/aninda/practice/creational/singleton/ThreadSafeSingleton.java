package com.aninda.practice.creational.singleton;

import java.io.Serializable;

public class ThreadSafeSingleton implements Serializable {
	private static ThreadSafeSingleton instance;
	private int value = 0;
	private ThreadSafeSingleton() {
		System.out.println("Initializing Singleton");
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public static ThreadSafeSingleton getInstance() {
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
	protected Object readResolve() {
		return instance;
	}
}
