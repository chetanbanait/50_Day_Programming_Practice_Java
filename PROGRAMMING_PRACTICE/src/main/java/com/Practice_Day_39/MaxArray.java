package com.Practice_Day_39;

public class MaxArray {

    static int max(int[] a, int index) {

        if (index == a.length - 1)
            return a[index];

        return Math.max(a[index], max(a, index + 1));
    }

    public static void main(String[] args) {

        int[] a = {10, 25, 5, 40, 15};

        System.out.println(max(a, 0));
    }
}
