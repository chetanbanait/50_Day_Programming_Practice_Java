package com.Practice_Day_30;

import java.util.Scanner;

public class AlphanumericPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String clean = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                clean += Character.toLowerCase(ch);
            }
        }

        String reverse = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }

        if (clean.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}