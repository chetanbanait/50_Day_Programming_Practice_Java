package com.Practice_Day_14;

import java.util.Scanner;

public class FactorialRecursion {

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Factorial = " + factorial(num));
    }
}