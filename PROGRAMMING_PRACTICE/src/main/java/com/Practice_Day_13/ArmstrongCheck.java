package com.Practice_Day_13;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

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
            System.out.println(num + " is Armstrong Number");
        else
            System.out.println(num + " is Not Armstrong Number");
    }
}