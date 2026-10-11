package com.Practice_Day_41;

public class BinaryStrings {

    static void generate(int n, String result) {

        if (result.length() == n) {
            System.out.println(result);
            return;
        }

        generate(n, result + "0");

        generate(n, result + "1");
    }

    public static void main(String[] args) {
        generate(3, "");
    }
}