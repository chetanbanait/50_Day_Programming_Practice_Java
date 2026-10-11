package com.Practice_Day_41;

public class StringSubsequence {

    static void generate(String str, String result, int index) {

        if (index == str.length()) {
            System.out.println(result);
            return;
        }

        generate(str, result + str.charAt(index), index + 1);

        generate(str, result, index + 1);
    }

    public static void main(String[] args) {
        generate("ABC", "", 0);
    }
}
