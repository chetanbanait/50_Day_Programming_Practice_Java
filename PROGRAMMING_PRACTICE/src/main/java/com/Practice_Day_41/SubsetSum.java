package com.Practice_Day_41;

public class SubsetSum {

    static boolean find(int[] arr, int index, int sum) {

        if (sum == 0)
            return true;

        if (index == arr.length)
            return false;

        if (find(arr, index + 1, sum - arr[index]))
            return true;

        return find(arr, index + 1, sum);
    }

    public static void main(String[] args) {

        int[] arr = {3, 34, 4, 12, 5, 2};

        int target = 9;

        System.out.println(find(arr, 0, target));
    }
}