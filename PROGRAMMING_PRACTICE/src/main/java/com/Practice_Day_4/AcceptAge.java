package com.Practice_Day_4;

import java.util.Scanner;

public class AcceptAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();

		System.out.println("Your Age is: " + age);

		sc.close();
	}
}
