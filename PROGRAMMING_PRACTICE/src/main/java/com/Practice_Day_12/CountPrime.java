package com.Practice_Day_12;

import java.util.Scanner;

public class CountPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int total = 0;

        for (int num = start; num <= end; num++) {

            int count = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0)
                    count++;
            }

            if (count == 2)
                total++;
        }

        System.out.println("Prime Count = " + total);
    }
}