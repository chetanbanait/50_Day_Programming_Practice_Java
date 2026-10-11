package com.Practice_Day_26;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] result = new int[a.length + b.length];

        int index = 0;

        for (int x : a) {
            result[index++] = x;
        }

        for (int x : b) {
            result[index++] = x;
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}