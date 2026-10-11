package com.Practice_Day_19;

public class HollowAlphabetTriangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            char ch = 'A';

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == n)
                    System.out.print(ch);
                else
                    System.out.print(" ");

                ch++;
            }

            System.out.println();
        }
    }
}