package com.aninda.practice.behavioral.command;

public class BankAccountCommand implements ICommand {
	public enum Action {
		DEPOSIT,
		WITHDRAW
	}
	private BankAccount account;
	private Action action;
	private double amount;
	private boolean success;
	

	public BankAccountCommand(BankAccount account, Action action, double amount) {
		super();
		this.account = account;
		this.action = action;
		this.amount = amount;
	}

	@Override
	public void call() {
		switch(action) {
			case DEPOSIT:
				this.success = true;
				account.deposit(amount);
				break;
			case WITHDRAW:
				success = account.withdraw(amount);
				break;
		}
	}

	@Override
	public void undo() {
		if(!success) return;
		switch(action) {
		case DEPOSIT:
			account.withdraw(amount);
			break;
		case WITHDRAW:
			account.deposit(amount);
			break;
	}
	}

}
