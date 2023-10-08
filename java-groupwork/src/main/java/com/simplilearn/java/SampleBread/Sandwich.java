package com.simplilearn.java.SampleBread;

import java.util.List;

public class Sandwich {
	
	private List<String> ingredients;
	
	public Sandwich(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	
	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Sandwich [ingredients=" + ingredients + "]";
	}
}
