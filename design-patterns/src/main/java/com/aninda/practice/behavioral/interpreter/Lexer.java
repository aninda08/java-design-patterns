package com.aninda.practice.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

import com.aninda.practice.behavioral.interpreter.Token.Type;

public class Lexer {
	public static List<Token> lex(String input) {
		List<Token> result = new ArrayList<Token>();
		
		for(int i= 0;i < input.length(); i++) {
			switch(input.charAt(i)) {
				case '+':
					result.add(new Token(Type.PLUS, "+"));
					break;
				case '-':
					result.add(new Token(Type.MINUS, "-"));
					break;
				case '(':
					result.add(new Token(Type.LPAREN, "("));
					break;
				case ')':
					result.add(new Token(Type.RPAREN, ")"));
					break;
				default:
					StringBuilder sb = new StringBuilder("" + input.charAt(i));
					for(int j = i+1; j<input.length(); j++) {
						if(Character.isDigit(input.charAt(j))) {
							sb.append(input.charAt(j));
							++i;
						} else {
							result.add(new Token(
									Type.INTEGER, 
									sb.toString()
									));
							break;
						}
					}
					break;
			}
		}
		
		return result;
	}
}
