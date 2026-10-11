package com.Practice_Day_45;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortUniqueTreeSetDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers =
                new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List:");
        System.out.println(numbers);

        TreeSet<Integer> sortedUnique =
                new TreeSet<>(numbers);

        System.out.println("Sorted Unique Elements:");
        System.out.println(sortedUnique);
    }
}