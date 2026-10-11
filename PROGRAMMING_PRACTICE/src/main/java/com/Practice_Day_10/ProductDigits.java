package com.Practice_Day_10;

import java.util.Scanner;

public class ProductDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num != 0) {
            product = product * (num % 10);
            num = num / 10;
        }

        System.out.println("Product = " + product);
    }
}