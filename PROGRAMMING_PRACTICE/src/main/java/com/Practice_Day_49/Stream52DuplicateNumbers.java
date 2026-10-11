package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Stream52DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);
        Set<Integer> seen = new HashSet<>();

        list.stream()
            .filter(n -> !seen.add(n))
            .distinct()
            .forEach(System.out::println);
    }
}