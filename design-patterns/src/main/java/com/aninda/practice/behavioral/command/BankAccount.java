package com.aninda.practice.behavioral.command;

public class BankAccount {
	private double balance;
	private double overdraftLimit = -500;
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + ", current balance " + balance);
	}
	
	public boolean withdraw(double amount) {
		if(balance - amount >= overdraftLimit) {
			balance -= amount;
			System.out.println("Withdrew " + amount + ", current balance " + balance);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	
}
