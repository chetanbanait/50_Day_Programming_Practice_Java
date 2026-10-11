package com.Practice_Day_41;

public class PalindromePartition {

    static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    static void partition(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 1; i <= str.length(); i++) {

            String part = str.substring(0, i);

            if (isPalindrome(part)) {

                partition(str.substring(i),
                           result + part + " ");
            }
        }
    }

    public static void main(String[] args) {
        partition("aab", "");
    }
}
