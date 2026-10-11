package com.Practice_Day_26;

public class SplitArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};

        int mid = a.length / 2;

        int[] first = new int[mid];
        int[] second = new int[a.length - mid];

        for (int i = 0; i < mid; i++) {
            first[i] = a[i];
        }

        for (int i = mid; i < a.length; i++) {
            second[i - mid] = a[i];
        }

        System.out.println("First Array:");

        for (int x : first) {
            System.out.print(x + " ");
        }

        System.out.println("\nSecond Array:");

        for (int x : second) {
            System.out.print(x + " ");
        }
    }
}