package com.Practice_Day_5;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        double totalSalary = basicSalary + hra + da;

        System.out.println("Total Salary = " + totalSalary);
    }
}
