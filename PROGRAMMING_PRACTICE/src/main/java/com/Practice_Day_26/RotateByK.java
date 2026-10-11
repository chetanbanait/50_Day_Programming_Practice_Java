package com.Practice_Day_26;

public class RotateByK {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int k = 2;

        k = k % a.length;

        for (int r = 1; r <= k; r++) {

            int last = a[a.length - 1];

            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }

            a[0] = last;
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}