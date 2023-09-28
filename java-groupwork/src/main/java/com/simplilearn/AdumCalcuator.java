package com.simplilearn;

import java.util.Scanner;

public class AdumCalcuator {
	
	public static void main(String [] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		double x = scanner.nextDouble();
		
		System.out.println("What is your second number?");
		double y = scanner.nextDouble();
		
		System.out.println("What is your third number?");
		double z = scanner.nextDouble();	
		
		AdumCalcuator calculator = new AdumCalcuator();
		
		System.out.println("Your answer is: " + calculator.TwoDividingThreeAddedNumbers(x, y, z));
		
	}
	
	private double TwoDividingThreeAddedNumbers (double a,double b,double c){
		double s = (a+b+c)/2;
		return s;
	}

}
