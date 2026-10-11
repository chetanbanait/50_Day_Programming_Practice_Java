package com.Practice_Day_45;

import java.util.ArrayList;

public class FindDuplicateArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i + 1; j < numbers.size(); j++) {

                if (numbers.get(i).equals(numbers.get(j))) {

                    System.out.println(numbers.get(i));
                    break;
                }
            }
        }
    }
}
