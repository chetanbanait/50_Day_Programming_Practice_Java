package com.Practice_Day_7;

import java.util.Scanner;

public class HighestSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first salary: ");
        double salary1 = sc.nextDouble();

        System.out.print("Enter second salary: ");
        double salary2 = sc.nextDouble();

        System.out.print("Enter third salary: ");
        double salary3 = sc.nextDouble();

        if (salary1 > salary2 && salary1 > salary3) {
            System.out.println("Highest Salary = " + salary1);
        } else if (salary2 > salary1 && salary2 > salary3) {
            System.out.println("Highest Salary = " + salary2);
        } else {
            System.out.println("Highest Salary = " + salary3);
        }
    }
}