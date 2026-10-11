package com.Practice_Day_22;

public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 5, 30};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second Smallest = " + secondSmallest);
    }
}