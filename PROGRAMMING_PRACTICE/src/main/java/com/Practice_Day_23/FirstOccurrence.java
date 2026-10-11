package com.Practice_Day_23;
public class FirstOccurrence {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};

        int key = 20;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("First Occurrence = " + i);
                break;
            }
        }
    }
}