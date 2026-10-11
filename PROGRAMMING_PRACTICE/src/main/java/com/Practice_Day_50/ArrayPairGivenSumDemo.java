package com.Practice_Day_50;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairGivenSumDemo {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            if (seen.contains(required)) {
                System.out.println("Pair: " + required + " and " + num);
                return;
            }

            seen.add(num);
        }

        System.out.println("Pair not found");
    }
}
