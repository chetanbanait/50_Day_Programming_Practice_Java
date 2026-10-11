package com.Practice_Day_50;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstringDemo {
    public static void main(String[] args) {
        String str = "abcabcbb";
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        System.out.println("Longest substring: "
                + str.substring(start, start + maxLength));
        System.out.println("Length: " + maxLength);
    }
}