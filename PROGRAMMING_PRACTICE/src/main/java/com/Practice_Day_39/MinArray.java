package com.Practice_Day_39;

public class MinArray {

    static int min(int[] a, int index) {

        if (index == a.length - 1)
            return a[index];

        return Math.min(a[index], min(a, index + 1));
    }

    public static void main(String[] args) {

        int[] a = {10, 25, 5, 40, 15};

        System.out.println(min(a, 0));
    }
}
