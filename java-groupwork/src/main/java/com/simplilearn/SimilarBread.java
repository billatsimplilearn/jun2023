package com.simplilearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimilarBread {

	public boolean compareBread(List<String> sandwich1, List<String> sandwich2) {

		String sandwich1Slice1 = sandwich1.get(0);
		String sandwich1Slice2 = sandwich1.get(sandwich1.size() - 1);
		String sandwich2Slice1 = sandwich2.get(0);
		String sandwich2Slice2 = sandwich2.get(sandwich2.size() - 1);

		if ((sandwich1Slice1.equals(sandwich2Slice2)) || (sandwich2Slice1.equals(sandwich2Slice2))) {

			System.out.println("true");

			return true;
		}

		else {
			System.out.println("false");

			return false;
		}

	}

	private boolean compareUpsideDown(List<String> sandwich1, List<String> sandwich2) {

		List<String> reversedSandwich1 = new ArrayList<>(sandwich1);
		List<String> reversedSandwich2 = new ArrayList<>(sandwich2);

		Collections.reverse(reversedSandwich1);
		Collections.reverse(reversedSandwich2);

		String reversesandwich1Slice1 = sandwich1.get(0);
		String reversesandwich1Slice2 = sandwich1.get(sandwich1.size() - 1);
		String reversesandwich2Slice1 = sandwich2.get(0);
		String reversesandwich2Slice2 = sandwich2.get(sandwich2.size() - 1);

		if ((reversesandwich1Slice1.equals(reversesandwich2Slice2))
				|| (reversesandwich2Slice1.equals(reversesandwich2Slice2))) {

			System.out.println("true");

			return true;
		}

		else {
			System.out.println("false");

			return false;
		}

	}

	public static void main(String[] args) {

		// String[] list1 = {"white bread", "lettuce", "bread"};
		// String[] list2 = {"white ", "tomato", "white bread"};

		List<String> sandwich1 = new ArrayList<>();
		//sandwich1 = List.of("white bread","chicken","White Bread"); & arrays.asList
		
		sandwich1.add("white bread");
		sandwich1.add("chicken");
		sandwich1.add("white");

		List<String> sandwich2 = new ArrayList<>();
		//sandwich2 = List.of("white bread","lettuce","White"); Alternative of .add method with few restrictions  
		//( List.of cannot accept null or any new value using .add) 
		sandwich2.add("white");
		sandwich2.add("chicken");
		sandwich2.add("white bread");
		sandwich2.add("white bread");

		SimilarBread result = new SimilarBread();
		// result.compareBread(sandwich1, sandwich2);
		result.compareUpsideDown(sandwich1, sandwich2);

	}

}
