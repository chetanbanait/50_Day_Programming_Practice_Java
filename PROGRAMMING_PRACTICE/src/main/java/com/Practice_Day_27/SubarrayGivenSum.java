package com.Practice_Day_27;

import java.util.Scanner;

public class SubarrayGivenSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter required sum: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum = sum + arr[j];

                if (sum == target) {

                    System.out.print("Subarray: ");

                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }

                    System.out.println();

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Subarray not found");
        }
    }
}
