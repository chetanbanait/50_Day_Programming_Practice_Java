package com.Practice_Day_12;

import java.util.Scanner;

public class CoPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {

            if (num1 % i == 0 && num2 % i == 0) {

                gcd = i;
            }
        }

        if (gcd == 1)
            System.out.println("Co-Prime Numbers");
        else
            System.out.println("Not Co-Prime Numbers");
    }
}