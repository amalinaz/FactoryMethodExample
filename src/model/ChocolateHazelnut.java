package model;

import java.util.ArrayList;
import java.util.Arrays;

public class ChocolateHazelnut extends Chocolate{
	private String[] ingredients = {"Chocolate", "Hazelnut"};
	
	public ChocolateHazelnut() {
	    setName("Chocolate Hazelnut");
	    setIngredients(new ArrayList<>(Arrays.asList(ingredients)));
	    }
}


