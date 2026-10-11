package com.Practice_Day_46;

import java.util.HashMap;
import java.util.Map;

public class Map05WordFrequency {
    public static void main(String[] args) {
        String str = "java sql java testing sql java";
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : str.split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
