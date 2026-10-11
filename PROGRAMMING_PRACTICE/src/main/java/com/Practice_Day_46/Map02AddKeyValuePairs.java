package com.Practice_Day_46;

import java.util.HashMap;

public class Map02AddKeyValuePairs {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Java", 90);
        marks.put("SQL", 85);
        marks.put("Testing", 95);

        System.out.println(marks);
    }
}