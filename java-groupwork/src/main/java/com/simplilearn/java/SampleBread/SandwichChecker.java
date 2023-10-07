package com.simplilearn.java.SampleBread;

import java.util.List;

public class SandwichChecker {
	
	// this checker needs to be updated
	public boolean compareSandwiches(Sandwich sandwich1, Sandwich sandwich2) {
		
		String sandwich1BreadTopSlice = getBreadTopSlice(sandwich1);
		String sandwich1BreadBottomSlice = getBreadBottomSlice(sandwich1);
		
		String sandwich2BreadTopSlice = getBreadTopSlice(sandwich2);
		String sandwich2BreadBottomSlice = getBreadBottomSlice(sandwich2);
		

		return (sandwich1BreadTopSlice.equalsIgnoreCase(sandwich2BreadTopSlice) &&
                sandwich1BreadBottomSlice.equalsIgnoreCase(sandwich2BreadBottomSlice)) ||
               (sandwich1BreadTopSlice.equalsIgnoreCase(sandwich2BreadBottomSlice) &&
                sandwich1BreadBottomSlice.equalsIgnoreCase(sandwich2BreadTopSlice));
	}
	
	// need to be true when both ingredients are swapped
	public String getBreadTopSlice(Sandwich sandwich) {
		List<String> ingredients = sandwich.getIngredients();
		return ingredients.get(0);
	}

	public String getBreadBottomSlice(Sandwich sandwich) {
		List<String> ingredients = sandwich.getIngredients();
		int noOfIngredients = getSizeOfIngredients(ingredients);
		String bread2Type = ingredients.get(noOfIngredients-1);
		return bread2Type;
	}
	
	public int getSizeOfIngredients(List<String> ingredients) {
		return ingredients.size();
	}
	
	public static void main(String[] argc) {
		
		// Test case 1
		
		List<String> ingredientsS1 = List.of("white bread", "lettuce","tomato", "veggie patty", "american cheese","rye bread");
		Sandwich sandwich1 = new Sandwich(ingredientsS1);
				
		System.out.println(sandwich1);
	
		List<String> ingredientsS2 = List.of("white bread", "cucumber", "jalapeno","veggie patty","avacado","cheese","rye bread");
		Sandwich sandwich2 = new Sandwich(ingredientsS2);
		
		System.out.println(sandwich2);
		
		SandwichChecker sc = new SandwichChecker();
		
		boolean compareResult = sc.compareSandwiches(sandwich1, sandwich2);
		
		System.out.println("Are Both Sandwiches (1 & 2) Same? " + compareResult);
		
		System.out.println("***************************************");
		
		
		// Test case 2
		
		List<String> ingredientsS3 = List.of("wheat bread","lettuce","veggie patty","american cheese","white bread");
		Sandwich sandwich3 = new Sandwich(ingredientsS3);
		
		System.out.println(sandwich3);
	
		List<String> ingredientsS4 = List.of("white bread","cucumber","chicken patty","avacado","cheese","wheat bread");
		Sandwich sandwich4 = new Sandwich(ingredientsS4);
		
		System.out.println(sandwich4);
		
		sc = new SandwichChecker();
		
		compareResult = sc.compareSandwiches(sandwich3, sandwich4);
		
		System.out.println("Are Both Sandwiches (3 & 4) Same? " + compareResult);    // should return true
		
		System.out.println("***************************************");
		
		
		// Test case 3
		
				List<String> ingredientsS5 = List.of("rye bread","lettuce","veggie patty","american cheese","wheat bread");
				Sandwich sandwich5 = new Sandwich(ingredientsS5);
				
				System.out.println(sandwich3);
			
				List<String> ingredientsS6 = List.of("rye bread","cucumber","chicken patty","avacado","cheese","white bread");
				Sandwich sandwich6 = new Sandwich(ingredientsS6);
				
				System.out.println(sandwich4);
				
				sc = new SandwichChecker();
				
				compareResult = sc.compareSandwiches(sandwich5, sandwich6);
				
				System.out.println("Are Both Sandwiches (5 & 6) Same? " + compareResult);    // should return true
				
				System.out.println("***************************************");
		
	}

}
