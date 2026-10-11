package com.Practice_Day_25;

public class CountRepeatedElements {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 3, 3, 4};

        int countRepeated = 0;

        for (int i = 0; i < a.length; i++) {

            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked)
                continue;

            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 1) {
                countRepeated++;
            }
        }

        System.out.println("Repeated Elements = " + countRepeated);
    }
}