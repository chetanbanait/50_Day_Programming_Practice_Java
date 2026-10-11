package com.Practice_Day_14;

import java.util.Scanner;

public class GeometricProgression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Term: ");
        int a = sc.nextInt();

        System.out.print("Enter Common Ratio: ");
        int r = sc.nextInt();

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        int term = a;

        for (int i = 1; i <= n; i++) {

            System.out.print(term + " ");

            term = term * r;
        }
    }
}