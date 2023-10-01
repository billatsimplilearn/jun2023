package com.simplilearn;

import java.util.ArrayList;
import java.util.List;

public class SimilarBread {

	public boolean compareBread(List<String> list1, List<String> list2) {

		
		if (list1.get(0).equals(list2.get(0)) || (list1.get(2).equals(list2.get(2)))) {

			System.out.println("true");
			
		} else {
			
			System.out.println("false");
		}
		
		return false;

	}


	public static void main(String[] args) {
		
		// String[] list1 = {"white bread", "lettuce", "bread"};
	    // String[] list2 = {"white ", "tomato", "white bread"};
				

		List<String> sandwich1 = new ArrayList<>();
		sandwich1.add("white ");
		sandwich1.add("chicken");
		sandwich1.add("white ");

		List<String> sandwich2 = new ArrayList<>();
		sandwich2.add("white bread");
		sandwich2.add("chicken");
		sandwich2.add("white bread");

		SimilarBread result = new SimilarBread();
		result.compareBread(sandwich1, sandwich2);

	}

}
