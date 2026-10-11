package com.Practice_Day_34;

class RemoveCommonCharacters {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

        String result = "";

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (s2.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}