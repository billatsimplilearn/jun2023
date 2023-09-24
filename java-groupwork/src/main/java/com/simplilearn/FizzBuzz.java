package com.simplilearn;

public class FizzBuzz {
	public String fizzBuzzResult(int i)
	{
		if(i<=0)
		{
			return "Invalid Input";
		}
		else if((i % 3 == 0) && (i % 5 == 0))
		{
			return "FizzBuzz";
		}
		else if(i % 3 == 0)
		{
			return "Fizz";
		}
		else if(i % 5 == 0)
		{
			return "Buzz";
		}
		else
		{
			return Integer.toString(i);
		}
	}
	public void countingNumbers(int start, int end)
	{
		for(int i = start; i < end; i++)
		{
			System.out.println(fizzBuzzResult(i));
		}
	}
	public static void main(String[] Arg)
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.countingNumbers(1,45);
	}
}
