package com.aninda.practice.creational.abstractfactory.factory;

import com.aninda.practice.creational.abstractfactory.IBaseFactory;
import com.aninda.practice.creational.abstractfactory.IProduct;
import com.aninda.practice.creational.abstractfactory.product.Mobile;

public class MobileFactory implements IBaseFactory {

	@Override
	public IProduct build() {
		// TODO Auto-generated method stub
		return new Mobile();
	}

}
