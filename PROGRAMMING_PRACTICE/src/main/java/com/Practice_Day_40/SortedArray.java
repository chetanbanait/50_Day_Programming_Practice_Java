package com.Practice_Day_40;

public class SortedArray {

    static boolean check(int[] a, int index) {

        if (index == a.length - 1)
            return true;

        if (a[index] > a[index + 1])
            return false;

        return check(a, index + 1);
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};

        System.out.println(check(a, 0));
    }
}