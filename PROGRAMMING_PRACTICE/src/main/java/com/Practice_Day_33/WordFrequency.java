package com.Practice_Day_33;

import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {

                if (words[i].equals(words[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            int count = 0;

            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j]))
                    count++;
            }

            System.out.println(words[i] + " = " + count);
        }
    }
}