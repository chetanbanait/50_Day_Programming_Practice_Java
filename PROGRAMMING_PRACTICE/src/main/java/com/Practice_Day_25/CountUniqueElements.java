package com.Practice_Day_25;

public class CountUniqueElements {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4, 4, 5};

        int unique = 0;

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                unique++;
            }
        }

        System.out.println("Unique Elements = " + unique);
    }
}