package model;

import factory.ChocolateFactory;

public class ChocolateStore {
	ChocolateFactory factory;
	Chocolate chocolate;
	public ChocolateStore(ChocolateFactory factory) {
		super();
		this.factory = factory;
		
	}
	
	public void showAll() {
		chocolate = factory.createChocolate();
		System.out.println(chocolate.getName());
		System.out.println("ingredients : "+ chocolate.getIngredients());
	}
}
