package com.Practice_Day_23;

public class FrequencyElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};

        int key = 20;

        int count = 0;

        for (int num : arr) {

            if (num == key)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}