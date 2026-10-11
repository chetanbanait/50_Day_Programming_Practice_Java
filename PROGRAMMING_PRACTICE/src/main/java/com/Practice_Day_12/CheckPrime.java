package com.Practice_Day_12;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}