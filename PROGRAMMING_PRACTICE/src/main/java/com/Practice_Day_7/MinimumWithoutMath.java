package com.Practice_Day_7;

import java.util.Scanner;

public class MinimumWithoutMath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        System.out.println("Minimum = " + min);
    }
}