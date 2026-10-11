package com.Practice_Day_4;

import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Obtained Marks: ");
		double obtainedMarks = sc.nextDouble();

		System.out.print("Enter Total Marks: ");
		double totalMarks = sc.nextDouble();

		double percentage = (obtainedMarks / totalMarks) * 100;

		System.out.println("Percentage = " + percentage + "%");

		sc.close();
	}
}
