package com.Practice_Day_26;

public class DeleteElement {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int position = 2;

        int[] result = new int[a.length - 1];

        for (int i = 0; i < position; i++) {
            result[i] = a[i];
        }

        for (int i = position; i < result.length; i++) {
            result[i] = a[i + 1];
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}