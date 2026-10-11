package com.Practice_Day_33;

import java.util.Scanner;

public class SortWordsAlphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = 0; j < words.length - 1 - i; j++) {

                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {

                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}