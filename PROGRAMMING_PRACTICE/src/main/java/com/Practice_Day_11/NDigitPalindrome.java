package com.Practice_Day_11;

import java.util.Scanner;

public class NDigitPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n) - 1;

        for (int i = start; i <= end; i++) {

            int num = i;
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            if (i == rev)
                System.out.print(i + " ");
        }
    }
}
