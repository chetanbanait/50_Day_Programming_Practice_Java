package com.Practice_Day_22;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {

        int[] arr = {50, 20, 80, 40, 10, 60};

        int k = 3;

        Arrays.sort(arr);

        System.out.println(k + "rd Largest = " + arr[arr.length - k]);
    }
}