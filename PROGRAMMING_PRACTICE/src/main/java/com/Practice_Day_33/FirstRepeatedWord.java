package com.Practice_Day_33;

import java.util.Scanner;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < i; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println("First repeated word = "
                                       + words[i]);
                    return;
                }
            }
        }

        System.out.println("No repeated word");
    }
}