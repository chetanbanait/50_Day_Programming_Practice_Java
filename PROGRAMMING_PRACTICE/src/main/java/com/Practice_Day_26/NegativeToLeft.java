package com.Practice_Day_26;

public class NegativeToLeft {
    public static void main(String[] args) {

        int[] a = {1, -2, 3, -4, 5, -6};

        int index = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {

                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;

                index++;
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}