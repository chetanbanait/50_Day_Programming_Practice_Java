package com.Practice_Day_47;

public class Ex21NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int n = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
            }

            int[] arr = {1, 2};
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch");
        }
    }
}
