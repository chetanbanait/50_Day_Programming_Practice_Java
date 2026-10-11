package com.Practice_Day_25;

public class CountDuplicateElements {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 3, 3, 4};

        int duplicates = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    duplicates++;
                    break;
                }
            }
        }

        System.out.println("Duplicate Elements = " + duplicates);
    }
}
