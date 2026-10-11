package com.Practice_Day_30;

import java.util.Scanner;

public class SentencePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String clean = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                clean += ch;
            }
        }

        String reverse = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }

        if (clean.equals(reverse))
            System.out.println("Sentence is Palindrome");
        else
            System.out.println("Sentence is Not Palindrome");
    }
}