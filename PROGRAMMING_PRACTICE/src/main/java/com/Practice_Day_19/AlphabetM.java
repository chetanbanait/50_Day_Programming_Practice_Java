package com.Practice_Day_19;

public class AlphabetM {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2))
                    System.out.print("M");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}