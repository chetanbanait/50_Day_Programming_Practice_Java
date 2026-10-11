package com.Practice_Day_5;

import java.util.Scanner;

public class RupeesToPaise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rupees: ");
        double rupees = sc.nextDouble();

        double paise = rupees * 100;

        System.out.println("Paise = " + paise);
    }
}
