package com.Practice_Day_4;


import java.util.Scanner;

public class FiveSubjectMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Java Marks: ");
		double java = sc.nextDouble();

		System.out.print("Enter SQL Marks: ");
		double sql = sc.nextDouble();

		System.out.print("Enter HTML Marks: ");
		double html = sc.nextDouble();

		System.out.print("Enter CSS Marks: ");
		double css = sc.nextDouble();

		System.out.print("Enter JavaScript Marks: ");
		double javascript = sc.nextDouble();

		System.out.println("Java Marks: " + java);
		System.out.println("SQL Marks: " + sql);
		System.out.println("HTML Marks: " + html);
		System.out.println("CSS Marks: " + css);
		System.out.println("JavaScript Marks: " + javascript);

		sc.close();
	}
}