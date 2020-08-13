package com.aninda.practice.structural.bridge.refinedabstraction;

import com.aninda.practice.structural.bridge.abstraction.APayment;

public class NetBankingPayment extends APayment {

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		_IPaymentSystem.processPayment("NetBanking Payment");
	}

}
