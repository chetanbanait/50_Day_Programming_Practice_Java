package com.Practice_Day_23;

public class ClosestElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int target = 33;

        int closest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (Math.abs(arr[i] - target) < Math.abs(closest - target)) {
                closest = arr[i];
            }
        }

        System.out.println("Target = " + target);
        System.out.println("Closest Element = " + closest);
    }
}