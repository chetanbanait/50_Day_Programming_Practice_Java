package com.Practice_Day_11;

import java.util.Scanner;

public class PalindromeRecursion {

    static int reverse = 0;

    static int rev(int num) {

        if (num == 0)
            return reverse;

        reverse = reverse * 10 + num % 10;

        return rev(num / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == rev(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}