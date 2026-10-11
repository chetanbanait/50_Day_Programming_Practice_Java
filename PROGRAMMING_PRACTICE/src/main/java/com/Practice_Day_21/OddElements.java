package com.Practice_Day_21;

public class OddElements {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66};

        System.out.println("Odd Elements:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}