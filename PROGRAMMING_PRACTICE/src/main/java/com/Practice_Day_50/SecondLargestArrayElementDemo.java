package com.Practice_Day_50;

public class SecondLargestArrayElementDemo {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 90, 30};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n < largest) {
                second = n;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}
