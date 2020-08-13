package com.aninda.practice.structural.bridge.abstraction;

import com.aninda.practice.structural.bridge.implementor.IPaymentSystem;

public abstract class APayment {
	public IPaymentSystem _IPaymentSystem;
	public abstract void makePayment();
	
}
