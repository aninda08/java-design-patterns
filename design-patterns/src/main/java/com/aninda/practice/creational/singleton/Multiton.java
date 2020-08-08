package com.aninda.practice.creational.singleton;

import java.util.HashMap;

public class Multiton {
	private static HashMap<MultitonType, Multiton> instances = new HashMap<>();
	private int value = 0;
	private Multiton() {
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public static Multiton get(MultitonType type) {
		if(!instances.containsKey(type))
			instances.put(type, new Multiton());
		return instances.get(type);
	}
}
