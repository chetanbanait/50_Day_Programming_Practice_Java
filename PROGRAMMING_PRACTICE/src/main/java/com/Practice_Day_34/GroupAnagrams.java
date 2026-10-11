package com.Practice_Day_34;

import java.util.*;

class GroupAnagrams {
    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}