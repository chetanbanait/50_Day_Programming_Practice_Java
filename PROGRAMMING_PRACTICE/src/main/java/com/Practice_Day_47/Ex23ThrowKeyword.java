package com.Practice_Day_47;

public class Ex23ThrowKeyword {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new IllegalArgumentException("Underage");
            }
            System.out.println("Eligible");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
