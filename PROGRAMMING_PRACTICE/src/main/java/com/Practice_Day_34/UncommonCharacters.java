package com.Practice_Day_34;

class UncommonCharacters {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (s2.indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
        }

        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);

            if (s1.indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
        }
    }
}
