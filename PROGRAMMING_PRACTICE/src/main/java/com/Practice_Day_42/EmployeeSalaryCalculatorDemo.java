package com.Practice_Day_42;

class EmployeeSalaryInfo {

	String name;
	double basicSalary;

	EmployeeSalaryInfo(String name, double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}

	void calculateSalary() {

		double hra = basicSalary * 0.20;
		double da = basicSalary * 0.10;

		double totalSalary = basicSalary + hra + da;

		System.out.println("Employee: " + name);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
		System.out.println("Total Salary: " + totalSalary);
	}
}

public class EmployeeSalaryCalculatorDemo {
	public static void main(String[] args) {

		EmployeeSalaryInfo e = new EmployeeSalaryInfo("Chetan", 30000);

		e.calculateSalary();
	}
}