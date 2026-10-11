package com.Practice_Day_3;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before Swapping");

		System.out.println("A = " + a);
		System.out.println("B = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping");

		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
}
