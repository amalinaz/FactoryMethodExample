package model;

import java.util.ArrayList;

public abstract class Chocolate {
	private String name;
	private ArrayList<String> ingredients;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}
	
	
}
