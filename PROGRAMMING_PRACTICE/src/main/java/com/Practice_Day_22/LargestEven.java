package com.Practice_Day_22;

public class LargestEven {

    public static void main(String[] args) {

        int[] arr = {15, 28, 40, 17, 62, 55};

        int largestEven = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
            }
        }

        if (largestEven == Integer.MIN_VALUE)
            System.out.println("No Even Element");
        else
            System.out.println("Largest Even = " + largestEven);
    }
}