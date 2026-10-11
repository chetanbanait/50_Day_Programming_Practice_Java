package com.Practice_Day_30;

import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (word.equalsIgnoreCase(reverse)) {
                System.out.println(word);
            }
        }
    }
}