package com.Practice_Day_5;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double area = side * side;

        System.out.println("Area of Square = " + area);
    }
}