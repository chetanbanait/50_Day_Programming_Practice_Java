package com.Practice_Day_21;

public class PositiveElements {
    public static void main(String[] args) {

        int[] arr = {-5, 10, -8, 15, 20, -2};

        System.out.println("Positive Elements:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}