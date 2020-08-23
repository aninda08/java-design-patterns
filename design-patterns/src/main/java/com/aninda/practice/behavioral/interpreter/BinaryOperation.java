package com.aninda.practice.behavioral.interpreter;

public class BinaryOperation implements IElement {
	public enum Type {
		ADDITION,
		SUBTRACTION
	}
	public Type type;
	public IElement left, right;

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		switch(type) {
			case ADDITION:
				return left.eval() + right.eval();
			case SUBTRACTION:
				return left.eval() - right.eval();
			default:
				return 0;
		}
	}

}
