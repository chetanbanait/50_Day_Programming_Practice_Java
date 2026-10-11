package com.Practice_Day_24;

public class AscendingOrder {
    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 3};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}