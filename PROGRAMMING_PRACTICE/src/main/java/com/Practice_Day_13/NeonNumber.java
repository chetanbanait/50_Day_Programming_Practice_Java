package com.Practice_Day_13;
import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int square = num * num;

        int sum = 0;

        while (square > 0) {

            int rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }

        if (sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}