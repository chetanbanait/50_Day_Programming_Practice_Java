package com.Practice_Day_27;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int totalSum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum = totalSum + arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index = " + i);
                return;
            }

            leftSum = leftSum + arr[i];
        }

        System.out.println("Equilibrium Index not found");
    }
}