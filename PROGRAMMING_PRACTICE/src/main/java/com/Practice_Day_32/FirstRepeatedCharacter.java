package com.Practice_Day_32;

import java.util.Scanner;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) !=
                str.lastIndexOf(str.charAt(i))) {

                System.out.println("First repeated = " +
                                   str.charAt(i));
                return;
            }
        }

        System.out.println("No repeated character");
    }
}