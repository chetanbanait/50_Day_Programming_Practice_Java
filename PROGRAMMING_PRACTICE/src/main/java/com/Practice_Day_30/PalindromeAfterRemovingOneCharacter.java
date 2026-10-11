package com.Practice_Day_30;

import java.util.Scanner;

public class PalindromeAfterRemovingOneCharacter {

    static boolean isPalindrome(String str, int left, int right) {

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                boolean result =
                        isPalindrome(str, left + 1, right) ||
                        isPalindrome(str, left, right - 1);

                System.out.println(result);
                return;
            }

            left++;
            right--;
        }

        System.out.println(true);
    }
}