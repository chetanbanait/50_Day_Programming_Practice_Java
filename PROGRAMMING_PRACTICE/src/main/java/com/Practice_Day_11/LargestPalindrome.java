package com.Practice_Day_11;

import java.util.Scanner;

public class LargestPalindrome {

    static boolean isPalindrome(int n) {

        int temp = n;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return temp == rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = end; i >= start; i--) {

            if (isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}