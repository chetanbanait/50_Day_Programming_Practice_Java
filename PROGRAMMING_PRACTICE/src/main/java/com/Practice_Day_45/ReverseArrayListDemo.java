package com.Practice_Day_45;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Before Reverse: " + numbers);

        Collections.reverse(numbers);

        System.out.println("After Reverse: " + numbers);
    }
}