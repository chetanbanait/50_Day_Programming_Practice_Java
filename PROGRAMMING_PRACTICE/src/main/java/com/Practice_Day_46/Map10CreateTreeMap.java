package com.Practice_Day_46;

import java.util.TreeMap;

public class Map10CreateTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println(map);
    }
}