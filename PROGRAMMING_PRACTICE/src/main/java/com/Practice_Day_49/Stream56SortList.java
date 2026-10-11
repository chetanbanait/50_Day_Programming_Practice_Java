package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream56SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50, 10, 40, 20, 30);

        List<Integer> sorted = list.stream()
            .sorted()
            .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
