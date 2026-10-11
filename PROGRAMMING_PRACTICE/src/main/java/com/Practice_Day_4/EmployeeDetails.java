package com.Practice_Day_4;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Employee ID: ");
		int employeeId = sc.nextInt();

		System.out.print("Enter Employee Salary: ");
		double salary = sc.nextDouble();

		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Salary: " + salary);

		sc.close();
	}
}