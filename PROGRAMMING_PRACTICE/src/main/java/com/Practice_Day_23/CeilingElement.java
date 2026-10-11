package com.Practice_Day_23;

public class CeilingElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int target = 35;

        int ceiling = -1;

        for (int num : arr) {

            if (num >= target) {
                ceiling = num;
                break;
            }
        }

        if (ceiling == -1)
            System.out.println("Ceiling Element Not Found");
        else
            System.out.println("Ceiling Element = " + ceiling);
    }
}
