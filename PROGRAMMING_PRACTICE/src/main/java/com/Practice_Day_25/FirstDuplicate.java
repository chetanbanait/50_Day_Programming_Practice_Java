package com.Practice_Day_25;

public class FirstDuplicate {
    public static void main(String[] args) {

        int[] a = {5, 1, 2, 3, 2, 4, 1};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {

                    System.out.println("First Duplicate = " + a[i]);
                    return;
                }
            }
        }
    }
}