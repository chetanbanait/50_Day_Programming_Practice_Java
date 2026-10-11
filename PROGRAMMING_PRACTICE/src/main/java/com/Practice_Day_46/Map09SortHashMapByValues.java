package com.Practice_Day_46;

import java.util.HashMap;
import java.util.Map;

public class Map09SortHashMapByValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 80);
        map.put("Amit", 60);
        map.put("Neha", 90);

        map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .forEach(System.out::println);
    }
}
