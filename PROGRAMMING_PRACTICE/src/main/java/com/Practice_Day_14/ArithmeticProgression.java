package com.Practice_Day_14;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Term: ");
        int a = sc.nextInt();

        System.out.print("Enter Common Difference: ");
        int d = sc.nextInt();

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print((a + i * d) + " ");
        }
    }
}