package com.Practice_Day_45;

import java.util.ArrayList;

public class SearchArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Chetan");
        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");

        String searchName = "Amit";

        if (names.contains(searchName)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}