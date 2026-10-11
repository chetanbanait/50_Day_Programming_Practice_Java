package com.Practice_Day_25;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 1, 4};

        for (int i = 0; i < a.length; i++) {

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {

                if (a[i] == a[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {

                int count = 0;

                for (int j = 0; j < a.length; j++) {

                    if (a[i] == a[j]) {
                        count++;
                    }
                }

                System.out.println(a[i] + " = " + count);
            }
        }
    }
}