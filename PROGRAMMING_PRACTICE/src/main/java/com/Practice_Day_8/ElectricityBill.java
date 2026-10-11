package com.Practice_Day_8;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = units * 3;
        } else {
            bill = units * 5;
        }

        System.out.println("Electricity Bill = " + bill);
    }
}
