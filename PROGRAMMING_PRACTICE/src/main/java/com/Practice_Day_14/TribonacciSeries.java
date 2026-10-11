package com.Practice_Day_14;

import java.util.Scanner;

public class TribonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int third = 1;

        if (n >= 1)
            System.out.print(first + " ");

        if (n >= 2)
            System.out.print(second + " ");

        if (n >= 3)
            System.out.print(third + " ");

        for (int i = 4; i <= n; i++) {

            int next = first + second + third;

            System.out.print(next + " ");

            first = second;
            second = third;
            third = next;
        }
    }
}