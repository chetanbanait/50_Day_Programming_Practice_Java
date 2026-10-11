package com.Practice_Day_34;

class Subsequence {
    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "ace";

        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }

            i++;
        }

        if (j == s2.length())
            System.out.println("Subsequence");
        else
            System.out.println("Not Subsequence");
    }
}
