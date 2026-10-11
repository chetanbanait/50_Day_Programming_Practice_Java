package com.Practice_Day_12;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.print("Prime Factors : ");

        for (int i = 2; i <= num; i++) {

            while (num % i == 0) {

                System.out.print(i + " ");
                num = num / i;
            }
        }
    }
}