package com.Practice_Day_28;

public class CompareToExample {
    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";

        int result = a.compareTo(b);

        if (result == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}