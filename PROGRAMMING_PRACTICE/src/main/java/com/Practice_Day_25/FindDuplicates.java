package com.Practice_Day_25;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 4, 1, 5};

        for (int i = 0; i < a.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}