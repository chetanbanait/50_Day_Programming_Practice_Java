package com.Practice_Day_24;

import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {

        int[] a = {4, 5, 6, 5, 4, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                int freq1 = map.get(a[i]);
                int freq2 = map.get(a[j]);

                if (freq1 < freq2) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                } else if (freq1 == freq2 && a[i] > a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}