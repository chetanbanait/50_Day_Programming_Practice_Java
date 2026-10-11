package com.Practice_Day_31;

import java.util.Scanner;

public class RemoveConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' || ch == 'u' ||
                !Character.isLetter(ch)) {

                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
