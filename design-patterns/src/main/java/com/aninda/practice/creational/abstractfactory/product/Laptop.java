package com.aninda.practice.creational.abstractfactory.product;

import com.aninda.practice.creational.abstractfactory.IProduct;

public class Laptop implements IProduct {

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("This is the slimmest laptop on earth");
	}

}
