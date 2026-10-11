package com.Practice_Day_40;

public class ReverseString {

    static void reverse(String s, int index) {

        if (index < 0)
            return;

        System.out.print(s.charAt(index));

        reverse(s, index - 1);
    }

    public static void main(String[] args) {

        String s = "Java";

        reverse(s, s.length() - 1);
    }
}