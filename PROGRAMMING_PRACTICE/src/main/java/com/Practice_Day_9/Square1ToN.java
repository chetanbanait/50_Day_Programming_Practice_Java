package com.Practice_Day_9;

import java.util.Scanner;

public class Square1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " = " + (i * i));
        }
    }
}
