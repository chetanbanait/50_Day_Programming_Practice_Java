package com.Practice_Day_21;

public class CountZeroElements {
    public static void main(String[] args) {

        int[] arr = {10, 0, 20, 0, 30, 40, 0};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        System.out.println("Number of Zero Elements = " + count);
    }
}