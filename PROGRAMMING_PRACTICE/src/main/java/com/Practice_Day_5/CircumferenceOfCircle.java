package com.Practice_Day_5;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circumference = 2 * 3.14 * radius;

        System.out.println("Circumference = " + circumference);
    }
}
