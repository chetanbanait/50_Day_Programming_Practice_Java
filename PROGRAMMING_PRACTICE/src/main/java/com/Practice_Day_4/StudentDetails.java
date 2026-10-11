package com.Practice_Day_4;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Roll Number: ");
		int rollNumber = sc.nextInt();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		System.out.print("Enter Marks: ");
		double marks = sc.nextDouble();

		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + marks);

		sc.close();
	}
}