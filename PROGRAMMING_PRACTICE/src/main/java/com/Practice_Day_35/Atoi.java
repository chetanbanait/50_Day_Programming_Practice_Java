package com.Practice_Day_35;

class Atoi {
    public static void main(String[] args) {

        String str = "12345";

        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            number = number * 10 + (ch - '0');
        }

        System.out.println(number);
    }
}