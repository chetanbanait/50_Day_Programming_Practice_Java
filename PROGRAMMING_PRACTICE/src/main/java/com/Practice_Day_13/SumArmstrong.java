package com.Practice_Day_13;

import java.util.Scanner;

public class SumArmstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        int total = 0;

        for (int num = start; num <= end; num++) {

            int temp = num;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == num)
                total += num;
        }

        System.out.println("Sum = " + total);
    }
}