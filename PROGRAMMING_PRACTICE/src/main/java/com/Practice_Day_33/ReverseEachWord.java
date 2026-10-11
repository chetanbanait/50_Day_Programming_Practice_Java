package com.Practice_Day_33;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }

            System.out.print(" ");
        }
    }
}