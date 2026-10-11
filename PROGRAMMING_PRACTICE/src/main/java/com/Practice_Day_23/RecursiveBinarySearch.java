package com.Practice_Day_23;

public class RecursiveBinarySearch {

    static int binarySearch(int[] arr, int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;

        if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);

        return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int key = 50;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found at Index = " + result);
    }
}
