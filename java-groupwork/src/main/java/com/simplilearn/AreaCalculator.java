package com.simplilearn;

import java.util.Scanner;

public class AreaCalculator {

	private int areaSquare() {

		shapes();
		Scanner num = new Scanner(System.in);

		System.out.println("Which Shape : \n");
		int shape = num.nextInt();

		System.out.println("Side Length : \n");
		int side = num.nextInt();

		int area = side * side;
		System.out.println("The Area is: " + area + "\n");

		return shape;

	}

	private static void shapes() {

		System.out.println("Shape Area Calculator \n");

		System.out.println("1) Triangle");
		System.out.println("2) Square");
		System.out.println("3) Rectangle");
		System.out.println("4) Circle");
		System.out.println("5) Quit \n");

	}

	public static void main(String[] args) {

		AreaCalculator result = new AreaCalculator();

		result.areaSquare();

	}

}
