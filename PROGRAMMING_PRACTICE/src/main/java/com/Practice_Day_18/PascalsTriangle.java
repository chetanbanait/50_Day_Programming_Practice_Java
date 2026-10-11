package com.Practice_Day_18;

public class PascalsTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            int number = 1;

            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 0; j <= i; j++) {

                System.out.print(number + " ");

                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}