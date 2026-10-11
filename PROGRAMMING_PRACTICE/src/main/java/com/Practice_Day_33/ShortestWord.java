package com.Practice_Day_33;

import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String shortest = words[0];

        for (String word : words) {

            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Shortest word = " + shortest);
    }
}