package com.Practice_Day_24;

public class SortZeroOne {
    public static void main(String[] args) {

        int[] a = {1, 0, 1, 1, 0, 0, 1};

        int countZero = 0;

        for (int x : a) {
            if (x == 0) {
                countZero++;
            }
        }

        for (int i = 0; i < a.length; i++) {

            if (i < countZero) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}