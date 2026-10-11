package com.Practice_Day_32;

import java.util.Scanner;

public class CountUniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) ==
                str.lastIndexOf(str.charAt(i))) {

                count++;
            }
        }

        System.out.println("Unique characters = " + count);
    }
}