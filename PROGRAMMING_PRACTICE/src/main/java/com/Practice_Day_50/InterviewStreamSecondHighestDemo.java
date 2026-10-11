package com.Practice_Day_50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InterviewStreamSecondHighestDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 90, 50, 90, 30);

        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() ->
                    new IllegalArgumentException("Not enough distinct numbers"));

        System.out.println("Second highest: " + secondHighest);
    }
}
