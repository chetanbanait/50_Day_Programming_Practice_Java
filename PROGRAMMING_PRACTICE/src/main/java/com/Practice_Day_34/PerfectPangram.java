package com.Practice_Day_34;

import java.util.Scanner;

class PerfectPangram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        boolean perfect = true;

        for (int i = 0; i < 26; i++) {

            if (count[i] != 1) {
                perfect = false;
                break;
            }
        }

        System.out.println(perfect ? "Perfect Pangram" : "Not Perfect Pangram");
    }
}
