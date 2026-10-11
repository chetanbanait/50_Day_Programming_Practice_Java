package com.Practice_Day_27;

import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int longest = 1;

        for (int i = 0; i < n; i++) {

            int count = 1;
            int current = arr[i];

            while (contains(arr, current + 1)) {

                current++;
                count++;
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest Consecutive Length = " + longest);
    }

    static boolean contains(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }
}