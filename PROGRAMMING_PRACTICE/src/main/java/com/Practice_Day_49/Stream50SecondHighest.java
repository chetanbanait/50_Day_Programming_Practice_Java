package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;

public class Stream50SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50, 20, 80, 80, 30);

        Integer result = list.stream()
            .distinct()
            .sorted((a, b) -> Integer.compare(b, a))
            .skip(1)
            .findFirst()
            .orElse(null);

        System.out.println(result);
    }
}