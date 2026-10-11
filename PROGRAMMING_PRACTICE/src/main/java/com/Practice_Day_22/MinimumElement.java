package com.Practice_Day_22;

public class MinimumElement {
    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 67, 12};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }
}