package com.Practice_Day_10;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        while (num >= 10) {
            num = num / 10;
        }

        System.out.println("First Digit = " + num);
    }
}