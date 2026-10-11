package com.Practice_Day_45;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        System.out.println("Before Removing Duplicates:");
        System.out.println(numbers);

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>(numbers);

        ArrayList<Integer> uniqueNumbers =
                new ArrayList<>(set);

        System.out.println("After Removing Duplicates:");
        System.out.println(uniqueNumbers);
    }
}