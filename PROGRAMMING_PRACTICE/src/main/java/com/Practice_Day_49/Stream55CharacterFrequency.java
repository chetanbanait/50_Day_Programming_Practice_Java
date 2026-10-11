package com.Practice_Day_49;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream55CharacterFrequency {
    public static void main(String[] args) {
        String str = "banana";

        Map<Character, Long> frequency = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        System.out.println(frequency);
    }
}