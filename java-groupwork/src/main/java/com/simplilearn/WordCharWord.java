package com.simplilearn;
import java.util.List;
import java.util.ArrayList;

public class WordCharWord 
{
	public String add(String insertString, String originalString)
	{		
		return originalString.replaceAll(" ", insertString);
	}
	public String add2(String insertString, String originalString)
	{
		int startIndex = 0;
		List<String> seprationStringList = new ArrayList<>();
		for(int i = 0; i<originalString.length(); i++)
		{
			if(originalString.charAt(i) == ' ')
			{
				seprationStringList.add(originalString.substring(startIndex, i));
				startIndex = i + 1;
			}
		}
		seprationStringList.add(originalString.substring(startIndex));
		String result ="";
		for(int i = 0; i<seprationStringList.size() - 1; i++)
		{
			result += seprationStringList.get(i);
			result += insertString;
		}
		result += seprationStringList.get(seprationStringList.size() - 1);
		return result;
	}
	public static void main(String[] Arg)
	{
		WordCharWord wcw = new WordCharWord();
		System.out.println(wcw.add(" x ", "a b c n d"));
		System.out.println(wcw.add2(" x ", "a b c n d"));
	}
}
