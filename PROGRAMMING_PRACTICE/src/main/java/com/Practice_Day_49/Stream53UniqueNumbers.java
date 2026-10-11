package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;

public class Stream53UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 40, 20);

        list.stream()
            .distinct()
            .forEach(System.out::println);
    }
}
