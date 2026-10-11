package com.Practice_Day_26;

public class ReverseGroups {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        for (int start = 0; start < a.length; start += k) {

            int left = start;
            int right = Math.min(start + k - 1, a.length - 1);

            while (left < right) {

                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
