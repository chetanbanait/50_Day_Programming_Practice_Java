package com.Practice_Day_14;

import java.util.Scanner;

public class AlternatingSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }
    }
}
