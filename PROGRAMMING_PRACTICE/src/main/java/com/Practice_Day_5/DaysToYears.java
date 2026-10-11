package com.Practice_Day_5;

import java.util.Scanner;

public class DaysToYears {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int years = days / 365;

        System.out.println("Years = " + years);
    }
}
