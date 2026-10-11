package com.Practice_Day_22;

public class MaximumElement {
    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 67, 12};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }
}