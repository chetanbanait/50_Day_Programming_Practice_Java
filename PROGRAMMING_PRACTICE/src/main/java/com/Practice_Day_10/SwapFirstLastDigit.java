package com.Practice_Day_10;

import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int power = 1;
        for (int i = 1; i < digits; i++) {
            power = power * 10;
        }

        int first = num / power;
        int middle = (num % power) / 10;

        int result = last * power + middle * 10 + first;

        System.out.println("After Swap = " + result);
    }
}
