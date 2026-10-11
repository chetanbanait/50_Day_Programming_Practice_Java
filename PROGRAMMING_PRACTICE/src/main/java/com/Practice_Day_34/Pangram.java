package com.Practice_Day_34;

import java.util.Scanner;

class Pangram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        boolean pangram = true;

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                pangram = false;
                break;
            }
        }

        System.out.println(pangram ? "Pangram" : "Not Pangram");
    }
}
