package com.Practice_Day_46;

import java.util.HashMap;
import java.util.Map;

public class Map04CharacterFrequency {
    public static void main(String[] args) {
        String str = "banana";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}