package com.simplilearn;

public class BasicArray {

	private int[] arrayBasics01() {

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {

			int array = -113;

			System.out.println("Slot " + i + " contains a " + array);
		}

		return num;

	}

	public static void main(String[] args) {

		BasicArray result = new BasicArray();

		result.arrayBasics01();

	}

}
