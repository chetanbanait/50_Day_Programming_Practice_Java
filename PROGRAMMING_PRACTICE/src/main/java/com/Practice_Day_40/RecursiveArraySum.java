package com.Practice_Day_40;

public class RecursiveArraySum {

    static int sum(int[] a, int index) {

        if (index == a.length)
            return 0;

        return a[index] + sum(a, index + 1);
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        System.out.println(sum(a, 0));
    }
}
