package com.Practice_Day_5;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in KG: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in Meter: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);
    }
}