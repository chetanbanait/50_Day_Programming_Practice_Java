package com.Practice_Day_32;

import java.util.Scanner;

public class LastRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println("Last repeated = " + ch);
                return;
            }
        }

        System.out.println("No repeated character");
    }
}