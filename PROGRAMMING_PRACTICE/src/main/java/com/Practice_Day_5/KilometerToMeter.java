package com.Practice_Day_5;

import java.util.Scanner;

public class KilometerToMeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Kilometer: ");
        double kilometer = sc.nextDouble();

        double meter = kilometer * 1000;

        System.out.println("Meter = " + meter);
    }
}