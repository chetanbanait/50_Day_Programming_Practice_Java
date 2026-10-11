package com.Practice_Day_46;

import java.util.HashMap;
import java.util.Map;

public class Map03IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Amit");
        students.put(2, "Neha");
        students.put(3, "Rahul");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}