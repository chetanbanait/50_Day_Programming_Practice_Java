package com.Practice_Day_13;

import java.util.Scanner;

public class PrintArmstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many Armstrong numbers: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;

        while (count < n) {

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

            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}