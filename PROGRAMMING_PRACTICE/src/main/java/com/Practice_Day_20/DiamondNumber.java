package com.Practice_Day_20;

public class DiamondNumber {

    public static void main(String[] args) {

        int n = 4;

        // Upper Part
        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print(j);

            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }

        // Lower Part
        for (int i = n - 1; i >= 1; i--) {

            for (int j = n; j > i; j--)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print(j);

            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }
    }
}