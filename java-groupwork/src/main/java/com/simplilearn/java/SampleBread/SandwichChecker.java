package com.simplilearn.java.SampleBread;

import java.util.List;

public class SandwichChecker {
	
	public boolean compareSandwiches(Sandwich sandwich1, Sandwich sandwich2) {
		
		String sandwich1Bread1Type = getBread1Type(sandwich1);
		String sandwich1Bread2Type = getBread2Type(sandwich1);
		
		boolean bread1 = false;

		if ((sandwich1Bread1Type.equalsIgnoreCase(sandwich1Bread2Type))) {
			bread1 = true;
		} else {
			bread1 = false;
		}
		
		String sandwich2Bread1Type = getBread1Type(sandwich2);
		String sandwich2Bread2Type = getBread2Type(sandwich2);
		boolean bread2 = false;
		
		if ((sandwich2Bread1Type.equalsIgnoreCase(sandwich2Bread2Type))) {
			bread2 = true;
		} else {
			bread2 = false;
		}
		return (bread1 && bread2);

	}
	
	public String getBread1Type(Sandwich sandwich) {
		List<String> ingredients = sandwich.getIngredients();
		return ingredients.get(0);
	}

	public String getBread2Type(Sandwich sandwich) {
		List<String> ingredients = sandwich.getIngredients();
		int noOfIngredients = getSizeOfIngredients(ingredients);
		String bread2Type = ingredients.get(noOfIngredients-1);
		return bread2Type;
	}
	
	public int getSizeOfIngredients(List<String> ingredients) {
		return ingredients.size();
	}
	
	public static void main(String[] argc) {
		
		List<String> ingredientsS1 = List.of("white bread", "lettuce","tomato", "veggie patty", "american cheese","white bread");
		Sandwich sandwich1 = new Sandwich(ingredientsS1);
				
		System.out.println(sandwich1);
	
		List<String> ingredientsS2 = List.of("white bread", "cucumber", "jalapeno","veggie patty","avacado","cheese","white bread");
		Sandwich sandwich2 = new Sandwich(ingredientsS2);
		
		System.out.println(sandwich2);
		
		SandwichChecker sc = new SandwichChecker();
		
		boolean compareResult = sc.compareSandwiches(sandwich1, sandwich2);
		
		System.out.println("Are Both Sandwiches (1 & 2) Same? " + compareResult);
		
		System.out.println("***************************************");
		
		List<String> ingredientsS3 = List.of("wheat bread","lettuce","veggie patty","american cheese","white bread");
		Sandwich sandwich3 = new Sandwich(ingredientsS3);
		
		System.out.println(sandwich3);
	
		List<String> ingredientsS4 = List.of("white bread","cucumber","chicken patty","avacado","cheese","wheat bread");
		Sandwich sandwich4 = new Sandwich(ingredientsS4);
		
		System.out.println(sandwich4);
		
		sc = new SandwichChecker();
		
		compareResult = sc.compareSandwiches(sandwich3, sandwich4);
		
		System.out.println("Are Both Sandwiches (3 & 4) Same? " + compareResult);
		
		System.out.println("***************************************");
		
	}

}
