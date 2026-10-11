package com.Practice_Day_22;

public class TopThreeLargest {

    public static void main(String[] args) {

        int[] arr = {45, 80, 20, 95, 60, 75};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                third = second;
                second = num;
            }
            else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("First Largest = " + first);
        System.out.println("Second Largest = " + second);
        System.out.println("Third Largest = " + third);
    }
}