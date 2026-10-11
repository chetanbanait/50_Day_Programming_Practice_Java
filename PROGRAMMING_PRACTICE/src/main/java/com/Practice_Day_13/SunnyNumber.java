package com.Practice_Day_13;

import java.util.Scanner;

public class SunnyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int value = num + 1;

        int sqrt = (int)Math.sqrt(value);

        if (sqrt * sqrt == value)
            System.out.println("Sunny Number");
        else
            System.out.println("Not Sunny Number");
    }
}