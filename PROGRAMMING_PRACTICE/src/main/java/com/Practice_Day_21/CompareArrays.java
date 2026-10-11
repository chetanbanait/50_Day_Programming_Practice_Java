package com.Practice_Day_21;

public class CompareArrays {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};

        boolean same = true;

        if (arr1.length != arr2.length) {
            same = false;
        } else {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    same = false;
                    break;
                }
            }
        }

        if (same) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are Not Equal");
        }
    }
}