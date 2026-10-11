package com.Practice_Day_27;

import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int product = 1;

            for (int j = 0; j < n; j++) {

                if (i != j) {
                    product = product * arr[j];
                }
            }

            result[i] = product;
        }

        System.out.println("Result:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

