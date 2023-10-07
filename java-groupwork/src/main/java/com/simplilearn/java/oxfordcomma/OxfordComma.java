package com.simplilearn.java.oxfordcomma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class OxfordComma {
	
	
	public String OxfordComma(List<String> words) {
		List<String> listOfWords = words;
		StringBuilder OxfordCommaList = new StringBuilder();
		int noOfWords = listOfWords.size();
		if (noOfWords == 0) {
			OxfordCommaList.append("");
		} else if (noOfWords == 1) {
			OxfordCommaList.append(listOfWords.get(0));
		} else if (noOfWords == 2) {
			OxfordCommaList.append(listOfWords.get(0)+" and "+ listOfWords.get(1));
		} else {
			for (int i = 0; i < noOfWords - 1; i++) {
				OxfordCommaList.append(listOfWords.get(i)).append(", ");
			}
			OxfordCommaList.append("and ").append(listOfWords.get(noOfWords-1));
		}
		return OxfordCommaList.toString();
	}
				
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String formattedString;
		
		OxfordComma oc = new OxfordComma();
				
		words.add("Alpha");
		words.add("Beta");
		words.add("Gama");
		words.add("Theta");
		words.add("Neta");
		formattedString = oc.OxfordComma(words);
		System.out.println("Formatted Text: " + formattedString);
	}
}