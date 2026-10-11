package com.Practice_Day_22;

public class ThreeSmallest {

    public static void main(String[] args) {

        int[] arr = {45, 80, 20, 95, 60, 5, 10};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num < second && num != first) {
                third = second;
                second = num;
            }
            else if (num < third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("First Smallest = " + first);
        System.out.println("Second Smallest = " + second);
        System.out.println("Third Smallest = " + third);
    }
}