package com.Practice_Day_26;

public class ReverseArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}