package com.Practice_Day_7;

import java.util.Scanner;

public class CheapestProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first product price: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter second product price: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter third product price: ");
        double price3 = sc.nextDouble();

        if (price1 < price2 && price1 < price3) {
            System.out.println("Cheapest Price = " + price1);
        } else if (price2 < price1 && price2 < price3) {
            System.out.println("Cheapest Price = " + price2);
        } else {
            System.out.println("Cheapest Price = " + price3);
        }
    }
}