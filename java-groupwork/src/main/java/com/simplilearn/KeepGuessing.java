package com.simplilearn;
import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
	public static void main(String[] Arg)
	{
		 Random r = new Random();
		 int answer = r.nextInt(9) + 1;
		 System.out.println(answer);
		 System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		 Scanner scanner = new Scanner(System.in);
		 int input;
		 while(true)
		 {
			 System.out.println("Your guess: ");
			 input = scanner.nextInt();
			 if(input == answer)
			 {
				 System.out.println("That's right! You're a good guesser.");
				 break;
			 }
			 else
			 {
				 System.out.println("That is incorrect. Guess again.");
			 }
		 }
	}
}
