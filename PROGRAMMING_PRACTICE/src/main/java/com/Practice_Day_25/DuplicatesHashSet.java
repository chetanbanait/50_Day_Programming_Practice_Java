package com.Practice_Day_25;

import java.util.HashSet;

public class DuplicatesHashSet {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int x : a) {

            if (!set.add(x)) {
                System.out.print(x + " ");
            }
        }
    }
}