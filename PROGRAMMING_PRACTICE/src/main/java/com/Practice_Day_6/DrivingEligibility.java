package com.Practice_Day_6;

import java.util.Scanner;

public class DrivingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are Eligible for Driving");
        } else {
            System.out.println("You are Not Eligible for Driving");
        }
    }
}