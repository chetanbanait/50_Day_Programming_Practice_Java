package com.Practice_Day_50;

import java.util.LinkedHashMap;
import java.util.Map;

public class Top62FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
                return;
            }
        }

        System.out.println("No unique character");
    }
}
