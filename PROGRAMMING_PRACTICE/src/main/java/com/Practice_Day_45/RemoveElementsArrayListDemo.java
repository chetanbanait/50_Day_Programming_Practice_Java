package com.Practice_Day_45;

import java.util.ArrayList;

public class RemoveElementsArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Chetan");
        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");

        System.out.println("Before Remove: " + names);

        names.remove("Rahul");

        System.out.println("After Remove: " + names);
    }
}
