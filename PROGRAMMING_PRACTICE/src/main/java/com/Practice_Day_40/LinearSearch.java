package com.Practice_Day_40;

public class LinearSearch {

    static int search(int[] a, int index, int target) {

        if (index == a.length)
            return -1;

        if (a[index] == target)
            return index;

        return search(a, index + 1, target);
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};

        System.out.println(search(a, 0, 30));
    }
}
