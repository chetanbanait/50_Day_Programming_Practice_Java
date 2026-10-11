package com.Practice_Day_5;

import java.util.Scanner;

public class MeterToCentimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Meter: ");
        double meter = sc.nextDouble();

        double centimeter = meter * 100;

        System.out.println("Centimeter = " + centimeter);
    }
}