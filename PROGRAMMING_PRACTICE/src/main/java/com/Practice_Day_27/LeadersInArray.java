package com.Practice_Day_27;

import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders:");

        for (int i = 0; i < n; i++) {

            boolean leader = true;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}