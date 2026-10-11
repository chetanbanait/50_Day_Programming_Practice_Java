package com.Practice_Day_22;

public class LargestOdd {

    public static void main(String[] args) {

        int[] arr = {15, 28, 40, 17, 62, 55};

        int largestOdd = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num % 2 != 0 && num > largestOdd) {
                largestOdd = num;
            }
        }

        if (largestOdd == Integer.MIN_VALUE)
            System.out.println("No Odd Element");
        else
            System.out.println("Largest Odd = " + largestOdd);
    }
}