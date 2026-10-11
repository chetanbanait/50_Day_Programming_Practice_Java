package com.Practice_Day_41;

public class Combinations {

    static void generate(int[] arr, int start, int k, String result) {

        if (k == 0) {
            System.out.println(result);
            return;
        }

        for (int i = start; i < arr.length; i++) {

            generate(arr, i + 1, k - 1, result + arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        generate(arr, 0, 2, "");
    }
}
