package com.Practice_Day_24;

public class SecondHalfDescending {
    public static void main(String[] args) {

        int[] a = {8, 4, 7, 2, 9, 1};

        int mid = a.length / 2;

        for (int i = mid; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {
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