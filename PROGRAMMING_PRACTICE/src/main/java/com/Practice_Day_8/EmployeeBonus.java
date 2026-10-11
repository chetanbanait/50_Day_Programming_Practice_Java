package com.Practice_Day_8;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        double bonus;

        if (salary < 20000) {
            bonus = salary * 20 / 100;
        } else if (salary <= 50000) {
            bonus = salary * 10 / 100;
        } else {
            bonus = salary * 5 / 100;
        }

        System.out.println("Employee Bonus = " + bonus);
    }
}
