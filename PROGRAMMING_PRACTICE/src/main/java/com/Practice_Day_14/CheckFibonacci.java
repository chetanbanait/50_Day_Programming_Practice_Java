package com.Practice_Day_14;

import java.util.Scanner;

public class CheckFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;

        while (second < num) {

            int next = first + second;

            first = second;
            second = next;
        }

        if (num == 0 || num == second)
            System.out.println("Fibonacci Number");
        else
            System.out.println("Not Fibonacci Number");
    }
}
