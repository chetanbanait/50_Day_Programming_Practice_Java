package com.Practice_Day_4;

import java.util.Scanner;

public class AcceptSalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		System.out.println("Employee Salary = " + salary);

		sc.close();
	}
}