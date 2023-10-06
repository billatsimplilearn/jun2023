package com.simplilearn;

import java.util.ArrayList;
import java.util.List;

public class SimilarBread {

	public boolean compareBread(List<String> sandwich1, List<String> sandwich2) {

		String sandwich1Slice1= sandwich1.get(0); 
		String sandwich1Slice2= sandwich1.get(sandwich1.size()-1); 
		String sandwich2Slice1= sandwich2.get(0);
		String sandwich2Slice2= sandwich2.get(sandwich2.size()-1); 
	     
		if( (sandwich1Slice1.equals(sandwich2Slice2)) || (sandwich2Slice1.equals(sandwich2Slice2))){
		
			System.out.println("true");
			
			
			return true;
		}
		
	
		else {System.out.println("false"); 
		 
		    return false;}
		
		
		

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
		sandwich2.add("white ");

		SimilarBread result = new SimilarBread();
		result.compareBread(sandwich1, sandwich2); 

	}

}
