package com.Practice_Day_12;

import java.util.Scanner;

public class PrimeRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = sc.nextInt();

        System.out.print("Enter End: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int count = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0)
                    count++;
            }

            if (count == 2)
                System.out.print(num + " ");
        }
    }
}