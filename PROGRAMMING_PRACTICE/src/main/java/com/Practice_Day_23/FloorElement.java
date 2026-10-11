package com.Practice_Day_23;

public class FloorElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int target = 35;

        int floor = -1;

        for (int num : arr) {

            if (num <= target) {
                floor = num;
            } else {
                break;
            }
        }

        if (floor == -1)
            System.out.println("Floor Element Not Found");
        else
            System.out.println("Floor Element = " + floor);
    }
}