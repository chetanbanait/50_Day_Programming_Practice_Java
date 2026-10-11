package com.Practice_Day_27;

import java.util.Scanner;

public class TripletWithGivenSum {
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

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {

                        System.out.println(
                            arr[i] + " + " +
                            arr[j] + " + " +
                            arr[k] + " = " + target
                        );

                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Triplet not found");
        }
    }
}