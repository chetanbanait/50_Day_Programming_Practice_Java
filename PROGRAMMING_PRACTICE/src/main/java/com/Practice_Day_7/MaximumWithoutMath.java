package com.Practice_Day_7;

import java.util.Scanner;

public class MaximumWithoutMath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("Maximum = " + max);
    }
}
