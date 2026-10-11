package com.Practice_Day_27;

import java.util.Scanner;

public class PairWithGivenSum {
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

                if (arr[i] + arr[j] == target) {

                    System.out.println(
                        arr[i] + " + " + arr[j] + " = " + target
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Pair not found");
        }
    }
}
