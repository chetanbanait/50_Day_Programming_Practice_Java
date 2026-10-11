package com.Practice_Day_13;
import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int square = num * num;

        int temp = num;

        while (temp > 0) {

            if (temp % 10 != square % 10) {
                System.out.println("Not Automorphic Number");
                return;
            }

            temp = temp / 10;
            square = square / 10;
        }

        System.out.println("Automorphic Number");
    }
}