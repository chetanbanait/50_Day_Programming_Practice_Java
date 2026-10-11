package com.Practice_Day_19;

public class AlphabetButterfly {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch);

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--)
                System.out.print(ch);

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (char ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch);

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--)
                System.out.print(ch);

            System.out.println();
        }
    }
}