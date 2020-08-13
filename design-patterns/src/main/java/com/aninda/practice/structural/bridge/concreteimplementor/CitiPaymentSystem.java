package com.aninda.practice.structural.bridge.concreteimplementor;

import com.aninda.practice.structural.bridge.implementor.IPaymentSystem;

public class CitiPaymentSystem implements IPaymentSystem {

	@Override
	public void processPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		System.out.println("Using CitiBank gateway for " + paymentSystem);
	}

}
