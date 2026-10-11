package com.Practice_Day_35;

class LongestPalindrome {
    public static void main(String[] args) {

        String str = "babad";

        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                String temp = str.substring(i, j + 1);

                String reverse = "";

                for (int k = temp.length() - 1; k >= 0; k--) {
                    reverse = reverse + temp.charAt(k);
                }

                if (temp.equals(reverse) &&
                    temp.length() > longest.length()) {

                    longest = temp;
                }
            }
        }

        System.out.println("Longest Palindrome = " + longest);
    }
}