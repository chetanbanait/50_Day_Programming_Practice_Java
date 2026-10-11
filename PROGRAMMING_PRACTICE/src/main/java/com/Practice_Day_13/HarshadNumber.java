package com.Practice_Day_13;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int temp = num;

        int sum = 0;

        while (temp > 0) {

            int rem = temp % 10;

            sum = sum + rem;

            temp = temp / 10;
        }

        if (num % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}