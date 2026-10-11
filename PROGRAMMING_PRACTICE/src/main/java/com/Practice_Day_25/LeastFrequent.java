package com.Practice_Day_25;

public class LeastFrequent {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 3, 3, 4};

        int minCount = a.length;
        int result = a[0];

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                result = a[i];
            }
        }

        System.out.println("Least Frequent = " + result);
    }
}