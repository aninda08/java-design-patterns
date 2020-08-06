package com.aninda.practice.creational.abstractfactory.product;

import com.aninda.practice.creational.abstractfactory.IProduct;

public class Mobile implements IProduct {

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("This is the smartest phone on earth");
	}

}
