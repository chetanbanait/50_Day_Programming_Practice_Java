package com.Practice_Day_19;

public class ReverseAlphabet {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {

            for (char ch = 'E'; ch >= 'E' - i + 1; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}