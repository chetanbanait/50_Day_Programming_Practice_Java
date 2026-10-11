package com.Practice_Day_6;

import java.util.Scanner;

public class CheckZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is Not Zero");
        }
    }
}