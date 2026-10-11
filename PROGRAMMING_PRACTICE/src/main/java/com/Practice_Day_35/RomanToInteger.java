package com.Practice_Day_35;

import java.util.*;

class RomanToInteger {
    public static void main(String[] args) {

        String roman = "IX";

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {

            int current = map.get(roman.charAt(i));

            if (i + 1 < roman.length() &&
                current < map.get(roman.charAt(i + 1))) {

                result = result - current;
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
    }
}
