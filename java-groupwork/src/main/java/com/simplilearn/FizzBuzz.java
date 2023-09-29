package com.simplilearn;

public class FizzBuzz {

	public static void main(String[] args) {
		
		FizzBuzz count = new FizzBuzz();
		count.fizzBuzz(100);
		
	}

	public void fizzBuzz(int num) {
		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else
				System.out.println(i);
		}
	}
}
