package com.Practice_Day_23;

public class DuplicateElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10};

        boolean found = false;

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("No Duplicate Found");
    }
}
