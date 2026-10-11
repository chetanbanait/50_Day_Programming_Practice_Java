package com.Practice_Day_22;
public class LargestNegative {

    public static void main(String[] args) {

        int[] arr = {-25, -10, -5, 15, 20};

        int largestNegative = Integer.MIN_VALUE;

        boolean found = false;

        for (int num : arr) {

            if (num < 0) {

                if (!found || num > largestNegative) {
                    largestNegative = num;
                    found = true;
                }
            }
        }

        if (found)
            System.out.println("Largest Negative = " + largestNegative);
        else
            System.out.println("No Negative Element");
    }
}