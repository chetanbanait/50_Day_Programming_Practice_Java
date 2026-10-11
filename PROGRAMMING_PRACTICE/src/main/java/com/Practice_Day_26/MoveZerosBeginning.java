package com.Practice_Day_26;

public class MoveZerosBeginning {
    public static void main(String[] args) {

        int[] a = {0, 1, 0, 3, 12};

        int index = a.length - 1;

        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] != 0) {
                a[index--] = a[i];
            }
        }

        while (index >= 0) {
            a[index--] = 0;
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}