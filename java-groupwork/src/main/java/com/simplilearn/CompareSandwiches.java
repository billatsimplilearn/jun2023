package com.simplilearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CompareSandwiches {

	public boolean hasSameBread(List<String> sand1, List<String> sand2) {

		/*
		 * Set<String> breads = new HashSet<>(); breads.remove(sand2.get(0));
		 * breads.remove(sand2.get(sand2.size()-1)); return breads.size() == 0;
		 */

//		List<String> arr1 = new ArrayList<>();
//		arr1.add(sand1.get(0));
//		arr1.add(sand1.get(sand1.size() - 1));
//		
//		List<String> arr2 = new ArrayList<>();
//		arr2.add(sand2.get(0));
//		arr2.add(sand2.get(sand2.size() - 1));
//		
//		return arr1.containsAll(arr2) && arr2.containsAll(arr1) ;
//		

		Set<String> breads1 = new HashSet<>();
		Set<String> breads2 = new HashSet<>();
		
		breads1.add(sand1.get(0));
		breads1.add(sand1.get(sand1.size() - 1));
		
		breads2.add(sand2.get(0));
		breads2.add(sand2.get(sand2.size() - 1));
		
		return breads1.equals(breads2);

//			if(sand1.get(0).equals(sand2.get(0)) && 
//					sand1.get(sand1.size() - 1).equals(sand2.get(sand1.size() - 1)) ) {
//				return true;
//			}else if (  sand1.get(0).equals(sand2.get(sand1.size() - 1)) &&
//					sand1.get(sand1.size() - 1).equals(sand2.get(0)) ) {				
//				return true;
//			}else {
//				return false;
//			}	

//			return ( sand1.get(0).equals(sand2.get(0)) && 
//					sand1.get(sand1.size() - 1).equals(sand2.get(sand1.size() - 1))  )||
//	                ( sand1.get(0).equals(sand2.get(sand1.size() - 1)) && 
//	                sand1.get(sand1.size() - 1).equals(sand2.get(0))  );

	}

	public static void main(String[] args) {

		List<String> sandwich1 = new ArrayList<String>();
		List<String> sandwich2 = new ArrayList<String>();
		List<String> sandwich3 = new ArrayList<String>();
		List<String> sandwich4 = new ArrayList<String>();
		List<String> sandwich5 = new ArrayList<String>();
		List<String> sandwich6 = new ArrayList<String>();
		List<String> sandwich7 = new ArrayList<String>();
		List<String> sandwich8 = new ArrayList<String>();

		sandwich1.addAll(List.of("white bread", "lettuce", "cheese", "turkey", "white bread"));
		sandwich2.addAll(List.of("white bread", "lettuce", "cheese", "turkey", "white bread"));

		sandwich3.addAll(List.of("white bread", "lettuce", "tomato", "brown bread"));
		sandwich4.addAll(List.of("white bread", "lettuce", "tomato", "white bread"));

		sandwich5.addAll(List.of("rye bread", "lettuce", "cheese", "ham", "white bread"));
		sandwich6.addAll(List.of("white bread", "lettuce", "cheese", "ham", "rye bread"));

		sandwich7.addAll(List.of("rye bread", "white bread"));
		sandwich8.addAll(List.of("white bread", "rye bread"));

		CompareSandwiches res = new CompareSandwiches();

		boolean resPair1 = res.hasSameBread(sandwich1, sandwich2);
		boolean resPair2 = res.hasSameBread(sandwich3, sandwich4);
		boolean resPair3 = res.hasSameBread(sandwich5, sandwich6);
		boolean resPair4 = res.hasSameBread(sandwich7, sandwich8);

		System.out.println("first pair is: " + resPair1);
		System.out.println("second pair is: " + resPair2);
		System.out.println("third pair is: " + resPair3);
		System.out.println("fourth pair is: " + resPair4);

	}

}
