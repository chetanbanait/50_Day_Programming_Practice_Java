package com.Practice_Day_23;

public class RotatedArraySearch {

    public static void main(String[] args) {

        int[] arr = {40, 50, 60, 70, 10, 20, 30};

        int key = 20;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found at Index = " + index);
    }
}