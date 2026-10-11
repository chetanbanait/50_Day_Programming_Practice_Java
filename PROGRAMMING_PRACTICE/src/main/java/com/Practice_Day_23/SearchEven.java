package com.Practice_Day_23;
public class SearchEven {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66};

        System.out.println("Even Elements:");

        for (int num : arr) {

            if (num % 2 == 0)
                System.out.print(num + " ");
        }
    }
}