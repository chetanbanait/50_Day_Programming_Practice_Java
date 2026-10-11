package com.Practice_Day_31;

import java.util.Scanner;

public class CountAllCharacterTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int special = 0;
        int uppercase = 0;
        int lowercase = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                uppercase++;

            if (Character.isLowerCase(ch))
                lowercase++;

            if (Character.isDigit(ch))
                digits++;

            if (ch == ' ')
                spaces++;

            if (Character.isLetter(ch)) {

                char x = Character.toLowerCase(ch);

                if (x == 'a' || x == 'e' ||
                    x == 'i' || x == 'o' || x == 'u')
                    vowels++;
                else
                    consonants++;

            } else if (!Character.isDigit(ch) && ch != ' ') {
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
        System.out.println("Special = " + special);
        System.out.println("Uppercase = " + uppercase);
        System.out.println("Lowercase = " + lowercase);
    }
}
