package com.Practice_Day_33;

import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {

            if (!result.contains(word)) {
                result += word + " ";
            }
        }

        System.out.println(result.trim());
    }
}