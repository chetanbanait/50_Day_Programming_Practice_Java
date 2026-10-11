package com.Practice_Day_26;

public class InsertElement {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};

        int position = 2;
        int value = 25;

        int[] result = new int[a.length + 1];

        for (int i = 0; i < position; i++) {
            result[i] = a[i];
        }

        result[position] = value;

        for (int i = position; i < a.length; i++) {
            result[i + 1] = a[i];
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}