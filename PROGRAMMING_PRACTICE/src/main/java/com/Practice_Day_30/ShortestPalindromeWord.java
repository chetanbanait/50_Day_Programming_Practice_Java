package com.Practice_Day_30;

import java.util.Scanner;

public class ShortestPalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String shortest = "";

        for (String word : words) {
            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (word.equalsIgnoreCase(reverse)) {

                if (shortest.equals("") ||
                    word.length() < shortest.length()) {

                    shortest = word;
                }
            }
        }

        System.out.println("Shortest palindrome word = " + shortest);
    }
}