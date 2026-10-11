package com.Practice_Day_31;

import java.util.Scanner;

public class FrequencyOfConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch != 'a' && ch != 'e' &&
                    ch != 'i' && ch != 'o' && ch != 'u') {

                    freq[ch - 'a']++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') +
                                   " = " + freq[i]);
            }
        }
    }
}