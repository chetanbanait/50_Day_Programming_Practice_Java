package com.Practice_Day_33;

import java.util.Scanner;

public class LengthOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word + " = " + word.length());
        }
    }
}
