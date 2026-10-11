package com.Practice_Day_29;

import java.util.Scanner;

public class ReverseEveryWordRecursion {

    static void reverseWord(String word, int index) {

        if (index < 0) {
            return;
        }

        System.out.print(word.charAt(index));

        reverseWord(word, index - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");

        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            reverseWord(words[i], words[i].length() - 1);

            System.out.print(" ");
        }
    }
}