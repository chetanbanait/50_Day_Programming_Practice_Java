package com.Practice_Day_45;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedListDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList =
                new ArrayList<>();

        LinkedList<String> linkedList =
                new LinkedList<>();

        arrayList.add("Chetan");
        arrayList.add("Rahul");

        linkedList.add("Chetan");
        linkedList.add("Rahul");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.add(1, "Amit");

        linkedList.add(1, "Amit");

        System.out.println("Updated ArrayList: " + arrayList);
        System.out.println("Updated LinkedList: " + linkedList);
    }
}