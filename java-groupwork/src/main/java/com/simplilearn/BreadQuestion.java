package com.simplilearn;
import java.util.List;
import java.util.ArrayList;

public class BreadQuestion {
	public boolean usingSameBread(List<String> sandwich1, List<String> sandwich2)
	{
		if((sandwich1.size() == 1 && sandwich2.size() >= 2) || (sandwich1.size() >= 2 && sandwich2.size() == 1))
		{
			return false;
		}	
		List<String> bread = new ArrayList<>();
		bread.add(sandwich1.get(0));
		if(sandwich1.size() >= 2)
		{
			//add last bread
			bread.add(sandwich1.get(sandwich1.size()-1));
		}
		
		if(!bread.remove(sandwich2.get(0)))
		{
			return false;
		}
		
		if(!bread.isEmpty())
		{
			if(!bread.remove(sandwich2.get(sandwich2.size() - 1)))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] Arg)
	{
		BreadQuestion bq = new BreadQuestion();

		List<String> sandwich1 = List.of("toast", "whatever", "white bread");
		List<String> sandwich2 = List.of("white bread", "whatever", "toast");
		System.out.println("expect true, get: " + bq.usingSameBread(sandwich1, sandwich2));
		
		List<String> sandwich3 = List.of("toast", "whatever", "toast");
		List<String> sandwich4 = List.of("toast", "whatever", "toast");
		System.out.println("expect true, get: " + bq.usingSameBread(sandwich3, sandwich4));
		
		List<String> sandwich5 = List.of("white bread", "whatever", "white bread");
		List<String> sandwich6 = List.of("toast", "whatever", "toast");
		System.out.println("expect false, get: " + bq.usingSameBread(sandwich5, sandwich6));
		
		List<String> sandwich7 = List.of("white bread", "whatever", "white bread");
		List<String> sandwich8 = List.of("white bread");
		System.out.println("expect false, get: " + bq.usingSameBread(sandwich7, sandwich8));
	}
}
