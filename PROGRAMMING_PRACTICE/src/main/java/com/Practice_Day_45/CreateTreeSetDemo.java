package com.Practice_Day_45;

import java.util.TreeSet;

public class CreateTreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers =
                new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("TreeSet: " + numbers);
    }
}