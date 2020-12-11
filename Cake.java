package project;

import java.util.Arrays;
import java.util.ArrayList;

class Cake {
	String Name;
	Cook cook;
	ArrayList<Ingredient> ingredients;
	
	Cake() {
		ingredients = new ArrayList<Ingredient> (Arrays.asList(
				new Ingredient(1) ,
				new Ingredient(2) , 
				new Ingredient(3)));
		
	}

}
