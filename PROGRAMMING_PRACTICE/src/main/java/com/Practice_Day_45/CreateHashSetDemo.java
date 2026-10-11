package com.Practice_Day_45;

import java.util.HashSet;

public class CreateHashSetDemo {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Chetan");
        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");

        System.out.println("HashSet: " + names);
    }
}
