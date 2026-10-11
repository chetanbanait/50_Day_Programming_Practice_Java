package com.Practice_Day_13;
import java.util.Scanner;

public class SpyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int temp = num;

        int sum = 0;
        int product = 1;

        while (temp > 0) {

            int rem = temp % 10;

            sum = sum + rem;
            product = product * rem;

            temp = temp / 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}