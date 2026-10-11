package com.Practice_Day_35;

class LongestUniqueSubstring {
    public static void main(String[] args) {

        String str = "abcabcbb";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String temp = "";

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;
            }

            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        System.out.println("Longest substring = " + result);
    }
}