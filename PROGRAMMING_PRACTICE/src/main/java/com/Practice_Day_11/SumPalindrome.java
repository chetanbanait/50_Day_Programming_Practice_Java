package com.Practice_Day_11;

public class SumPalindrome {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 1000; i++) {

            int num = i;
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            if (i == rev)
                sum += i;
        }

        System.out.println(sum);
    }
}