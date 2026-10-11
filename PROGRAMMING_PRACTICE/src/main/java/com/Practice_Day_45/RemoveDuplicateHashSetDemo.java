package com.Practice_Day_45;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateHashSetDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers =
                new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List:");
        System.out.println(numbers);

        HashSet<Integer> uniqueNumbers =
                new HashSet<>(numbers);

        System.out.println("After Removing Duplicates:");
        System.out.println(uniqueNumbers);
    }
}