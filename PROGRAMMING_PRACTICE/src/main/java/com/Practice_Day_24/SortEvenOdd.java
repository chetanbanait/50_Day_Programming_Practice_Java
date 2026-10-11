package com.Practice_Day_24;

public class SortEvenOdd {
    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 4, 7, 6};

        // First sort complete array
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int x : a) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        for (int x : a) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
    }
}