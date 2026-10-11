package com.Practice_Day_10;

import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = num;

        while (first >= 10) {
            first = first / 10;
        }

        System.out.println("Sum = " + (first + last));
    }
}