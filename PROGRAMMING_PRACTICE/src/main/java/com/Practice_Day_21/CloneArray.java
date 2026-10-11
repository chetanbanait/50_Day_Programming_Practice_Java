package com.Practice_Day_21;

public class CloneArray {
    public static void main(String[] args) {

        int[] arr1 = {5, 10, 15, 20};

        int[] arr2 = arr1.clone();

        System.out.println("Cloned Array:");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}