package com.Practice_Day_33;

import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split(" ");

        String mostFrequent = "";
        int max = 0;

        for (int i = 0; i < words.length; i++) {

            int count = 0;

            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                }
            }
      
            if (count > max) {
                max = count;
                mostFrequent = words[i];
            }
        }

        System.out.println("Most frequent word = "
                           + mostFrequent);

        System.out.println("Frequency = " + max);
    }
}
