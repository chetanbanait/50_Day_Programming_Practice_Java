package com.Practice_Day_14;

import java.util.Scanner;

public class SumFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + first;

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println("Sum = " + sum);
    }
}