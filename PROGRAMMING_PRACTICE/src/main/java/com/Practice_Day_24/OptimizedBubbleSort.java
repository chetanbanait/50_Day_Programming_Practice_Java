package com.Practice_Day_24;

public class OptimizedBubbleSort {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}