package com.Practice_Day_45;

import java.util.ArrayList;

public class CommonElementsListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list1 =
                new ArrayList<>();

        ArrayList<Integer> list2 =
                new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        System.out.println("Common Elements:");

        for (Integer number : list1) {

            if (list2.contains(number)) {
                System.out.println(number);
            }
        }
    }
}
