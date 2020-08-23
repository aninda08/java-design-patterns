package com.aninda.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.aninda.practice.behavioral.interpreter.BinaryOperation;
import com.aninda.practice.behavioral.interpreter.IElement;
import com.aninda.practice.behavioral.interpreter.Integer;
import com.aninda.practice.behavioral.interpreter.Lexer;
import com.aninda.practice.behavioral.interpreter.Parser;
import com.aninda.practice.behavioral.interpreter.Token;
import com.aninda.practice.behavioral.interpreter.Token.Type;

/**
 * Command pattern imports
 * 
 * import com.aninda.practice.behavioral.command.BankAccount;
 * import com.aninda.practice.behavioral.command.BankAccountCommand;
 * import com.aninda.practice.behavioral.command.BankAccountCommand.Action;
 */

/**
 * Behavioral Design Patterns Demo implementation
 * @author Aninda
 *
 */
public class BehavioralPatternsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * --------------------Command Patterns--------------------
		 * 
		 * BankAccount account = new BankAccount();
		 * List<BankAccountCommand> commands = new ArrayList<>();
		 * commands.add(new BankAccountCommand(account, Action.DEPOSIT, 100));
		 * commands.add(new BankAccountCommand(account, Action.WITHDRAW, 1000));
		 * for(BankAccountCommand command: commands) {
		 * 	command.call();
		 * 	System.out.println(account);
		 * }
		 * Collections.reverse(commands);
		 * for(BankAccountCommand command: commands) {
		 * 	command.undo();
		 * 	System.out.println(account);
		 * }
		 */
		
		/**
		 * -------------------Interpreter Patterns-------------------
		 * 
		 * String input = "(15+41)-(12+8)";
		 * List<Token> tokens = Lexer.lex(input);
		 * System.out.println(tokens.stream().map(t -> t.toString()).collect(Collectors.joining("\t")));
		 * System.out.println(input + " = " + Parser.parse(tokens).eval());
		 */
		
		
	}
	
}















