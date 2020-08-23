package com.aninda.practice.behavioral.interpreter;

public class Integer implements IElement {
	private int value;

	public Integer(int value) {
		super();
		this.value = value;
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return value;
	}

}
