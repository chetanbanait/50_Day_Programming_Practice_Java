package com.Practice_Day_41;

public class CombinationSum {

    static void find(int[] arr, int index, int target, String result) {

        if (target == 0) {
            System.out.println(result);
            return;
        }

        if (target < 0 || index == arr.length)
            return;

        find(arr, index, target - arr[index],
             result + arr[index] + " ");

        find(arr, index + 1, target, result);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};

        find(arr, 0, 7, "");
    }
}