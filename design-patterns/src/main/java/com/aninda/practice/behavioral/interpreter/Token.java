package com.aninda.practice.behavioral.interpreter;

public class Token {
	public enum Type {
		INTEGER,
		PLUS,
		MINUS,
		LPAREN,
		RPAREN
	}
	public Type type;
	public String text;
	public Token(Type type, String text) {
		super();
		this.type = type;
		this.text = text;
	}
	@Override
	public String toString() {
		return "`" + text + "`";
	}
	
}
