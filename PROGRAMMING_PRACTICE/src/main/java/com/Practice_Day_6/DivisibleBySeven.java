package com.Practice_Day_6;

import java.util.Scanner;

public class DivisibleBySeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println("Number is Divisible by 7");
        } else {
            System.out.println("Number is Not Divisible by 7");
        }
    }
}
