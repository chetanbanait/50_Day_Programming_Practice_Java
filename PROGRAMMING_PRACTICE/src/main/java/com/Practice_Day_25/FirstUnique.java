package com.Practice_Day_25;

public class FirstUnique {
    public static void main(String[] args) {

        int[] a = {4, 5, 1, 2, 1, 4};

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Unique = " + a[i]);
                return;
            }
        }
    }
}
