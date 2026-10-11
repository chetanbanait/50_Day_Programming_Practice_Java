package com.Practice_Day_42;

class StaticCalculator {

    static int square(int number) {
        return number * number;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {

        int result = StaticCalculator.square(5);

        System.out.println("Square = " + result);
    }
}