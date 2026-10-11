package com.Practice_Day_33;

import java.util.Scanner;

public class FirstUniqueWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            int count = 0;

            for (int j = 0; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j]))
                    count++;
            }

            if (count == 1) {
                System.out.println("First unique word = "
                                   + words[i]);
                return;
            }
        }

        System.out.println("No unique word");
    }
}