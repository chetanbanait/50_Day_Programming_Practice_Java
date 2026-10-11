package com.Practice_Day_24;

public class CountingSort {
    public static void main(String[] args) {

        int[] a = {4, 2, 2, 8, 3, 3, 1};

        int max = a[0];

        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }

        int[] count = new int[max + 1];

        for (int x : a) {
            count[x]++;
        }

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}