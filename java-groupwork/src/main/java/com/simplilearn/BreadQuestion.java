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
		List<String> bread1 = new ArrayList<>();
		bread1.add("toast");
		bread1.add("white bread");
		List<String> bread2 = new ArrayList<>();
		bread2.add("white bread");
		bread2.add("wheat bread");
		System.out.println(bq.usingSameBread(bread1, bread2));
	}
}
