package com.Practice_Day_45;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before Sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting: " + numbers);
    }
}