package com.Practice_Day_50;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateElementsDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
