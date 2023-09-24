package com.simplilearn;

public class FizzBuzz {

	public void fizzBuzz (int upperBound ) {
		for (int i = 1; i <= upperBound; i++) {
			if(i % 3 ==0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
			
			

			
		}
	}

	public static void main(String[] args) {

		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.fizzBuzz(100);

	}

}
