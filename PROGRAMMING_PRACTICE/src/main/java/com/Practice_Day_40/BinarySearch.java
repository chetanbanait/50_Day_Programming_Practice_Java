package com.Practice_Day_40;

public class BinarySearch {

    static int search(int[] a, int low, int high, int target) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (a[mid] == target)
            return mid;

        if (target < a[mid])
            return search(a, low, mid - 1, target);

        return search(a, mid + 1, high, target);
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        System.out.println(search(a, 0, a.length - 1, 40));
    }
}
