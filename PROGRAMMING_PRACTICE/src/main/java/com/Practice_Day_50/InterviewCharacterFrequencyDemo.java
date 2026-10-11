package com.Practice_Day_50;

import java.util.HashMap;
import java.util.Map;

public class InterviewCharacterFrequencyDemo {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}