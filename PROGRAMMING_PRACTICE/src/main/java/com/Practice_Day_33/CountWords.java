package com.Practice_Day_33;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Words = 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Words = " + words.length);
        }
    }
}