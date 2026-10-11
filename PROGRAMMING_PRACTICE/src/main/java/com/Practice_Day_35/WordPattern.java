package com.Practice_Day_35;

import java.util.*;

class WordPattern {
    public static void main(String[] args) {

        String pattern = "abba";
        String sentence = "dog cat cat dog";

        String[] words = sentence.split(" ");

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        boolean result = true;

        if (pattern.length() != words.length) {
            result = false;
        } else {

            for (int i = 0; i < pattern.length(); i++) {

                char ch = pattern.charAt(i);

                if (map.containsKey(ch)) {

                    if (!map.get(ch).equals(words[i])) {
                        result = false;
                        break;
                    }

                } else {

                    if (used.contains(words[i])) {
                        result = false;
                        break;
                    }

                    map.put(ch, words[i]);
                    used.add(words[i]);
                }
            }
        }

        System.out.println(result);
    }
}
