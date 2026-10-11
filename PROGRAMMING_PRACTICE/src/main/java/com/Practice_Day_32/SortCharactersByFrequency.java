package com.Practice_Day_32;

import java.util.Scanner;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int count = str.length(); count >= 1; count--) {

            for (int i = 0; i < 256; i++) {

                if (freq[i] == count) {

                    for (int j = 0; j < count; j++) {
                        System.out.print((char)i);
                    }
                }
            }
        }
    }
}