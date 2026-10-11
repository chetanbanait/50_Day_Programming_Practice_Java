package com.Practice_Day_22;

public class SmallestPositive {

    public static void main(String[] args) {

        int[] arr = {-5, 20, -10, 15, 2, 9};

        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num > 0 && num < smallest) {
                smallest = num;
            }
        }

        if (smallest == Integer.MAX_VALUE)
            System.out.println("No Positive Element");
        else
            System.out.println("Smallest Positive = " + smallest);
    }
}