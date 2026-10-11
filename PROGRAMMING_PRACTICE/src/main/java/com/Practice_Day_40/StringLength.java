package com.Practice_Day_40;

public class StringLength {

    static int length(String s, int index) {

        if (index == s.length())
            return 0;

        return 1 + length(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(length("Java", 0));
    }
}
