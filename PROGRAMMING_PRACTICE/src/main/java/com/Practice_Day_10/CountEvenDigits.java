package com.Practice_Day_10;

import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Even Digits = " + count);
    }
}
