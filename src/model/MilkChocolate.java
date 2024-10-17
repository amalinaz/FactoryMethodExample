package model;

import java.util.ArrayList;
import java.util.Arrays;

public class MilkChocolate extends Chocolate {
    private String[] ingredients = {"Chocolate", "Milk"};
    
    public MilkChocolate() {
        setName("Milk Chocolate");

        setIngredients(new ArrayList<>(Arrays.asList(ingredients)));
    }
}
