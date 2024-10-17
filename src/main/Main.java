package main;

import factory.ChocolateHazelnutFactory;
import factory.MilkChocolateFactory;
import model.Chocolate;
import model.ChocolateStore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateStore ChocolateVariant1 = new ChocolateStore(new MilkChocolateFactory());
		ChocolateStore ChocolateVariant2 = new ChocolateStore(new ChocolateHazelnutFactory());
		
		System.out.println("Chocolate Variant:");
		ChocolateVariant1.showAll();
		ChocolateVariant2.showAll();
		
		
	}

}
