package com.simplilearn;

import java.util.Scanner;

public class CountingMachine {

	private int countMachine() {

		Scanner input = new Scanner(System.in);

		System.out.println("Count to ");
		int num = input.nextInt();

		for (int i = 0; i <= num; i++) {

			System.out.println(i);

		}

		return num;

	}

	public static void main(String[] args) {

		CountingMachine result = new CountingMachine();

		result.countMachine();

	}

}
