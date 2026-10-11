package com.Practice_Day_4;

import java.util.Scanner;

public class AcceptName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Name: ");
		String name = sc.nextLine();

		System.out.println("Your Name is: " + name);

		sc.close();
	}
}