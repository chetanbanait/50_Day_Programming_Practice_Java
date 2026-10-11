package com.Practice_Day_22;

public class DifferenceMaxMin {

    public static void main(String[] args) {

        int[] arr = {25, 10, 50, 80, 15};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {

            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        System.out.println("Difference = " + (max - min));
    }
}