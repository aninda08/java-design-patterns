package com.aninda.practice.creational.abstractfactory.factory;

import com.aninda.practice.creational.abstractfactory.IBaseFactory;
import com.aninda.practice.creational.abstractfactory.IProduct;
import com.aninda.practice.creational.abstractfactory.product.Laptop;

public class LaptopFactory implements IBaseFactory {

	@Override
	public IProduct build() {
		// TODO Auto-generated method stub
		return new Laptop();
	}

}
