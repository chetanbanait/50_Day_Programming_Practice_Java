package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream54NumberFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 10);

        Map<Integer, Long> frequency = list.stream()
            .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        System.out.println(frequency);
    }
}