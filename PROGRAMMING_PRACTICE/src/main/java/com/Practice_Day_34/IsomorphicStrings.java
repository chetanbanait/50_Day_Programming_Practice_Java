package com.Practice_Day_34;

import java.util.*;

class IsomorphicStrings {
    public static void main(String[] args) {

        String s1 = "egg";
        String s2 = "add";

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        boolean result = true;

        if (s1.length() != s2.length()) {
            result = false;
        } else {

            for (int i = 0; i < s1.length(); i++) {

                char a = s1.charAt(i);
                char b = s2.charAt(i);

                if (map.containsKey(a)) {

                    if (map.get(a) != b) {
                        result = false;
                        break;
                    }

                } else {

                    if (used.contains(b)) {
                        result = false;
                        break;
                    }

                    map.put(a, b);
                    used.add(b);
                }
            }
        }

        System.out.println(result);
    }
}