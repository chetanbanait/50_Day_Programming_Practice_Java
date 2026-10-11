package com.Practice_Day_26;

public class RearrangePositiveNegative {
    public static void main(String[] args) {

        int[] a = {1, -2, 3, -4, 5, -6};

        int[] result = new int[a.length];

        int index = 0;

        // Negative elements
        for (int x : a) {
            if (x < 0) {
                result[index++] = x;
            }
        }

        // Positive elements
        for (int x : a) {
            if (x >= 0) {
                result[index++] = x;
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}