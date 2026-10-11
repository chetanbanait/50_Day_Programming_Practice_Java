package com.Practice_Day_28;

public class EqualsIgnoreCaseExample {
    public static void main(String[] args) {

        String a = "JAVA";
        String b = "java";

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}