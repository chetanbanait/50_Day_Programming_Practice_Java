package com.Practice_Day_11;

public class CountPalindrome {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 1000; i++) {

            int num = i;
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            if (i == rev)
                count++;
        }

        System.out.println("Count = " + count);
    }
}