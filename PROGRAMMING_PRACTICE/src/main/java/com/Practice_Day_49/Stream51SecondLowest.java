package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;

public class Stream51SecondLowest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50, 20, 10, 30);

        Integer result = list.stream()
            .distinct()
            .sorted()
            .skip(1)
            .findFirst()
            .orElse(null);

        System.out.println(result);
    }
}