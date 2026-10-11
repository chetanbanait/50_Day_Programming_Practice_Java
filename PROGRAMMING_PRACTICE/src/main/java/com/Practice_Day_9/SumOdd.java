package com.Practice_Day_9;

public class SumOdd {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
