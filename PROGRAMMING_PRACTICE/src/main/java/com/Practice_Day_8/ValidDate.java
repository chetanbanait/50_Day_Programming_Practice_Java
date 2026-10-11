package com.Practice_Day_8;

import java.util.Scanner;

public class ValidDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (day >= 1 && day <= 31 &&
            month >= 1 && month <= 12 &&
            year > 0) {

            System.out.println("Valid Date");

        } else {

            System.out.println("Invalid Date");
        }
    }
}
