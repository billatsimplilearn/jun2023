package com.simplilearn;

import java.util.Scanner;

public class ALittleQuiz {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you ready for a quiz? please enter Yes or No");
		String responds = scanner.next();
		
		if(responds.equalsIgnoreCase("no") ) {
			System.out.println("Okay try it when you are ready");
			
		}else {
			System.out.println("Okay, here it comes! ");
			
			System.out.println("What is the capital of Alaska?\n"
					+ "1) Melbourne\n"
					+ "2) Anchorage\n"
					+ "3) Juneau");
			int q1= scanner.nextInt();
			
			int c=0;
		
			if(q1==3) {
				System.out.println("That right ! ");
					c = c+1;
			}
			System.out.println("Can you store the value 'cat' in a variable type int?\n"
					+ "1) Yes\n"
					+ "2) No\n");
			int q2= scanner.nextInt();
			
			if(q2==2) {
				System.out.println("Thats right ! ");
					c = c+1;
					System.out.println("your answe is : " + q2);
					//System.out.println("your answe is : " + c);
			}else {
				System.out.println("Sorry 'cat' is string. ints can only store numbers");
			}
			System.out.println("What is the result of 9+6/3?\n"
					+ "1) 5\n"
					+ "2) 11\n"
					+ "3) 15/3");
			int q3= scanner.nextInt();
			if(q3==2) {
				System.out.println("Thats right ! ");
					c = c+1;
					System.out.println("That's correct !");
			}
			
			System.out.println("Overall,you got " + c + " of of 3 questions\n "
					+ "Thanks for Playing!");
		}
		
		
	}
}
