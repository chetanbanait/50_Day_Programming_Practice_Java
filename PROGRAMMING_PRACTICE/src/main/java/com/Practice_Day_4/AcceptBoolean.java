package com.Practice_Day_4;

import java.util.Scanner;

public class AcceptBoolean {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Boolean Value (true/false): ");
		boolean value = sc.nextBoolean();

		System.out.println("Boolean Value = " + value);

		sc.close();
	}
}