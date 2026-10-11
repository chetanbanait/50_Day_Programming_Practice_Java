package com.Practice_Day_41;

public class NumberPermutation {

    static void permutation(int[] arr, boolean[] used, String result) {

        if (result.length() == arr.length * 2) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!used[i]) {
                used[i] = true;

                permutation(arr, used, result + arr[i] + " ");

                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        boolean[] used = new boolean[arr.length];

        permutation(arr, used, "");
    }
}