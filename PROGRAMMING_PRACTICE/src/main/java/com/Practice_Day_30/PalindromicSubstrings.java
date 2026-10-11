package com.Practice_Day_30;

import java.util.Scanner;

public class PalindromicSubstrings {

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if (sub.length() > 1 && isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }
}
