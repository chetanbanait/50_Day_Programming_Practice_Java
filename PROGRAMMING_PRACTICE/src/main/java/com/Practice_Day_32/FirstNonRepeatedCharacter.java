package com.Practice_Day_32;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated = " + ch);
                return;
            }
        }

        System.out.println("No unique character");
    }
}
