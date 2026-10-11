package com.Practice_Day_46;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map07FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non-repeated: " + e.getKey());
                return;
            }
        }

        System.out.println("No non-repeated character");
    }
}