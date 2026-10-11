package com.Practice_Day_35;

class LongestCommonSubstring {
    public static void main(String[] args) {

        String s1 = "abcdef";
        String s2 = "zcdemf";

        String longest = "";

        for (int i = 0; i < s1.length(); i++) {

            for (int j = 0; j < s2.length(); j++) {

                int x = i;
                int y = j;
                String temp = "";

                while (x < s1.length() &&
                       y < s2.length() &&
                       s1.charAt(x) == s2.charAt(y)) {

                    temp = temp + s1.charAt(x);

                    x++;
                    y++;
                }

                if (temp.length() > longest.length()) {
                    longest = temp;
                }
            }
        }

        System.out.println("Longest Common Substring = " + longest);
    }
}
