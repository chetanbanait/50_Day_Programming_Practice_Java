package com.Practice_Day_4;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== STUDENT REGISTRATION =====");

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter Email: ");
		String email = sc.nextLine();

		System.out.print("Enter Mobile Number: ");
		long mobileNumber = sc.nextLong();

		sc.nextLine();

		System.out.print("Enter Course Name: ");
		String course = sc.nextLine();

		System.out.print("Enter Percentage: ");
		double percentage = sc.nextDouble();

		System.out.println("\n===== REGISTRATION DETAILS =====");

		System.out.println("Student Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Course: " + course);
		System.out.println("Percentage: " + percentage + "%");

		System.out.println("\nRegistration Successful!");

		sc.close();
	}
}
