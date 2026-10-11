package com.Practice_Day_25;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 1, 4};

        int[] result = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {

            boolean found = false;

            for (int j = 0; j < index; j++) {

                if (a[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[index++] = a[i];
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}