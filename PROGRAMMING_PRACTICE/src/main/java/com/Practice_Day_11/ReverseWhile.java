package com.Practice_Day_11;

import java.util.Scanner;

public class ReverseWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = 0;

        while (num > 0) {

            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(reverse);
    }
}