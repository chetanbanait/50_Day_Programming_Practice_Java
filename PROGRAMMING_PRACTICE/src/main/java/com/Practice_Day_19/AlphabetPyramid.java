package com.Practice_Day_19;

public class AlphabetPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++)
                System.out.print(" ");

            char ch = 'A';

            for (int j = 1; j <= i; j++)
                System.out.print(ch++);

            ch -= 2;

            for (int j = 1; j < i; j++)
                System.out.print(ch--);

            System.out.println();
        }
    }
}