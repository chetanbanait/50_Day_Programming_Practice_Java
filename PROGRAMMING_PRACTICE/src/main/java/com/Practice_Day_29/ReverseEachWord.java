package com.Practice_Day_29;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {

                reverse = reverse + words[i].charAt(j);
            }

            System.out.print(reverse + " ");
        }
    }
}
