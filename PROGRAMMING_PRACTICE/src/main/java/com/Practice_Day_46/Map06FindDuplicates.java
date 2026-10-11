package com.Practice_Day_46;

import java.util.HashMap;
import java.util.Map;

public class Map06FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println("Duplicate: " + e.getKey());
            }
        }
    }
}