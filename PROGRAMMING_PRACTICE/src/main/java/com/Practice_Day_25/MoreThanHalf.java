package com.Practice_Day_25;

public class MoreThanHalf {
    public static void main(String[] args) {

        int[] a = {2, 2, 2, 1, 2};

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > a.length / 2) {

                System.out.println("Element = " + a[i]);
                return;
            }
        }

        System.out.println("No majority element");
    }
}