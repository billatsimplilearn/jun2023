package com.simplilearn;
import java.util.Scanner;

public class Planet {
	private String _name;
	private double _weight_coefficient;
	Planet(String name, double weight_coefficient)
	{
		_name = name;
		_weight_coefficient = weight_coefficient;
	}
	public String getName()
	{
		return _name;
	}
	public double convertWeightFromEarth(double weight)
	{
		return _weight_coefficient * weight;
	}
	
	
	public static void main(String[] Arg)
	{
		Planet[] planets = new Planet[6];
		planets[0] = new Planet("Venus", 0.78);
		planets[1] = new Planet("Mars", 0.39);
		planets[2] = new Planet("Jupiter", 2.65);
		planets[3] = new Planet("Saturn", 1.17);
		planets[4] = new Planet("Uranus", 1.05);
		planets[5] = new Planet("Neptune", 1.23);
		
		System.out.println("Please enter your current earth weight: ");
		Scanner scanner = new Scanner(System.in);
		double weight = scanner.nextDouble();
		System.out.println("I have information for the following planets: ");
		for(int i = 0; i<planets.length; i++)
		{
			System.out.println((i+1)+". " + planets[i].getName() + " ");
		}
		System.out.println("Which planet are you visiting?");
		int option = scanner.nextInt();
		System.out.println("Your weight would be " + planets[option-1].convertWeightFromEarth(weight) + " pounds on that planet.");
	}
}
