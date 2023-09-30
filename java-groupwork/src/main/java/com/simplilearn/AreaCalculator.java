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

	private int areaRectangle() {

		shapes();
		Scanner num = new Scanner(System.in);

		System.out.println("Which Shape : \n");
		int shape = num.nextInt();

		System.out.println("Side Length : \n");
		int length = num.nextInt();

		System.out.println("Side Width : \n");
		int width = num.nextInt();

		int area = length * width;
		System.out.println("The Area is: " + area + "\n");

		return shape;

	}

	private int areaTriangle() {
		shapes();
		Scanner num = new Scanner(System.in);

		System.out.println("Which Shape : \n");
		int shape = num.nextInt();

		System.out.println("Side Base : \n");
		int base = num.nextInt();
		
		System.out.println("Side Height : \n");
		int height = num.nextInt();

		System.out.println("The Area is: " + 0.5 * base * height + "\n");

		return shape;

	}
	
	private int areaCircle() {

		shapes();
		Scanner num = new Scanner(System.in);

		System.out.println("Which Shape : \n");
		int shape = num.nextInt();

		System.out.println("Side Radius : \n");
		int radius = num.nextInt();

		double area = Math.PI * radius * radius;
		System.out.println("The Area is: " + area + "\n");

		return shape;

	}
	
	private static void quit() {
		shapes();
		Scanner num = new Scanner(System.in);
		
		System.out.println("Which Shape : \n");
		int shape = num.nextInt();

		System.out.println("Invalid Shape");
		
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

		// result.areaSquare();
		// result.areaRectangle();
		// result.areaTriangle();
		// result.areaCircle();
		result.quit();

	}

}
