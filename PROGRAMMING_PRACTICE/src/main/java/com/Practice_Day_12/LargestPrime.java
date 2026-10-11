package com.Practice_Day_12;

import java.util.Scanner;

public class LargestPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start : ");
        int start = sc.nextInt();

        System.out.print("Enter End : ");
        int end = sc.nextInt();

        int largest = -1;

        for (int num = start; num <= end; num++) {

            int count = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0)
                    count++;
            }

            if (count == 2)
                largest = num;
        }

        if (largest != -1)
            System.out.println("Largest Prime = " + largest);
        else
            System.out.println("No Prime Number Found");
    }
}