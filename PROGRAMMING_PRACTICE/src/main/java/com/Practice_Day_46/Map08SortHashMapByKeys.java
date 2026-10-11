package com.Practice_Day_46;

import java.util.HashMap;
import java.util.TreeMap;

public class Map08SortHashMapByKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        TreeMap<Integer, String> sorted = new TreeMap<>(map);
        System.out.println(sorted);
    }
}