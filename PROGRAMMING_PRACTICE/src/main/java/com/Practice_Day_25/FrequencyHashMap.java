package com.Practice_Day_25;

import java.util.HashMap;

public class FrequencyHashMap {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : a) {

            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);
    }
}
