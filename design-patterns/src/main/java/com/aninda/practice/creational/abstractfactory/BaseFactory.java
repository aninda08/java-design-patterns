package com.aninda.practice.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class BaseFactory {
	public enum AvailableProduct {
		MOBILE, LAPTOP;
	}
	
	private Map<AvailableProduct, IBaseFactory> factories =
		    new HashMap<>();
	
	public BaseFactory() throws Exception {
		//loading all product factories
		for(AvailableProduct product: AvailableProduct.values()) {
			String productName = product.toString();
			String factoryName = "" + Character.toUpperCase(productName.charAt(0)) + productName.substring(1).toLowerCase();
			Class<?> factory = Class.forName(
					"com.aninda.practice.creational.abstractfactory.factory." + factoryName + "Factory");
			factories.put(product, (IBaseFactory) factory.getDeclaredConstructor().newInstance());
		}
	}

	public IProduct produce(AvailableProduct product) {
		return factories.get(product).build();
	}
}
