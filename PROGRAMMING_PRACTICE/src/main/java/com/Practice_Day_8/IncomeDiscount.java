package com.Practice_Day_8;

import java.util.Scanner;

public class IncomeDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        double discount;

        if (income < 25000) {
            discount = income * 20 / 100;
        } else if (income <= 50000) {
            discount = income * 10 / 100;
        } else {
            discount = income * 5 / 100;
        }

        System.out.println("Discount = " + discount);
    }
}
