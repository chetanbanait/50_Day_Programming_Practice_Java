package com.Practice_Day_27;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                System.out.println("Majority Element = " + arr[i]);
                return;
            }
        }

        System.out.println("Majority Element not found");
    }
}
