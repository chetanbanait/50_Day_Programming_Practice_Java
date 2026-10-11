package com.Practice_Day_26;

public class SwapAdjacent {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < a.length - 1; i += 2) {

            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}