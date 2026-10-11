package com.Practice_Day_46;

import java.util.HashMap;

public class Map01CreateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Chetan");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        System.out.println(map);
    }
}