package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;

public class Stream48MaximumNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50, 20, 80, 30);

        System.out.println(
            list.stream().max(Integer::compareTo).orElse(null));
    }
}