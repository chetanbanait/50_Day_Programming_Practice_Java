package com.Practice_Day_39;

public class ArraySum {

    static int sum(int[] a, int index) {

        if (index == a.length)
            return 0;

        return a[index] + sum(a, index + 1);
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};

        System.out.println(sum(a, 0));
    }
}
