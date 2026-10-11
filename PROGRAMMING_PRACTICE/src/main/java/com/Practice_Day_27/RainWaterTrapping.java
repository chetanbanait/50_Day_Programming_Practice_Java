package com.Practice_Day_27;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int water = 0;

        for (int i = 0; i < n; i++) {

            int leftMax = arr[i];

            for (int j = 0; j < i; j++) {
                if (arr[j] > leftMax) {
                    leftMax = arr[j];
                }
            }

            int rightMax = arr[i];

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > rightMax) {
                    rightMax = arr[j];
                }
            }

            int min = Math.min(leftMax, rightMax);

            water = water + (min - arr[i]);
        }

        System.out.println("Trapped Water = " + water);
    }
}
