package com.Practice_Day_29;

import java.util.Scanner;

public class ReverseWithoutBuiltIn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}