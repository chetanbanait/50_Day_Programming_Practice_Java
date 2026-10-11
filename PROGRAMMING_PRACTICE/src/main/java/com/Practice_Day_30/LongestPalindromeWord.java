package com.Practice_Day_30;

import java.util.Scanner;

public class LongestPalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (word.equalsIgnoreCase(reverse) &&
                word.length() > longest.length()) {

                longest = word;
            }
        }

        System.out.println("Longest palindrome word = " + longest);
    }
}