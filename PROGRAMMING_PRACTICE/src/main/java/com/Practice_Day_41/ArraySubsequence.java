package com.Practice_Day_41;

public class ArraySubsequence {

    static void generate(int[] arr, int index, String result) {

        if (index == arr.length) {
            System.out.println(result);
            return;
        }

        generate(arr, index + 1, result + arr[index] + " ");

        generate(arr, index + 1, result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        generate(arr, 0, "");
    }
}
