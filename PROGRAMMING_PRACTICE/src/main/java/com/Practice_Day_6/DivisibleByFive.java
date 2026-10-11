package com.Practice_Day_6;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Number is Divisible by 5");
        } else {
            System.out.println("Number is Not Divisible by 5");
        }
    }
}