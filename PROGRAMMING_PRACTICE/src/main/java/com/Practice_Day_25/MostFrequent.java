package com.Practice_Day_25;

public class MostFrequent {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 2, 4, 1};

        int maxCount = 0;
        int result = a[0];

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = a[i];
            }
        }

        System.out.println("Most Frequent = " + result);
    }
}