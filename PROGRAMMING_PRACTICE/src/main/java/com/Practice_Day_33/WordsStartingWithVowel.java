package com.Practice_Day_33;

import java.util.Scanner;

public class WordsStartingWithVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (String word : words) {

            char ch = Character.toLowerCase(word.charAt(0));

            if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' || ch == 'u') {

                System.out.println(word);
            }
        }
    }
}