package com.Practice_Day_13;
import java.util.Scanner;

public class PrintPerfect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int sum = 0;

            for (int i = 1; i < num; i++) {

                if (num % i == 0)
                    sum += i;
            }

            if (sum == num)
                System.out.print(num + " ");
        }
    }
}