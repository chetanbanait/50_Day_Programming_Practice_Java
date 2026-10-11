package com.Practice_Day_9;

import java.util.Scanner;

public class CountRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = sc.nextInt();

        System.out.print("Enter End: ");
        int end = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            count++;
        }

        System.out.println("Count = " + count);
    }
}