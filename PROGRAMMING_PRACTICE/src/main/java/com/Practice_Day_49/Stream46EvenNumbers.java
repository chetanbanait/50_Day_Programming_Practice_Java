package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;

public class Stream46EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
