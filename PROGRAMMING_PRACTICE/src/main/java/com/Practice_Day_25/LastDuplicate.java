package com.Practice_Day_25;

public class LastDuplicate {
    public static void main(String[] args) {

        int[] a = {5, 1, 2, 3, 2, 4, 1};

        int result = -1;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    result = a[i];
                }
            }
        }

        System.out.println("Last Duplicate = " + result);
    }
}