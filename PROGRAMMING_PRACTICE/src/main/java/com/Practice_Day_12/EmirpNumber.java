package com.Practice_Day_12;

import java.util.Scanner;

public class EmirpNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;

        while (temp != 0) {

            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        int count1 = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0)
                count1++;
        }

        int count2 = 0;

        for (int i = 1; i <= reverse; i++) {

            if (reverse % i == 0)
                count2++;
        }

        if (count1 == 2 && count2 == 2 && num != reverse)
            System.out.println("Emirp Number");
        else
            System.out.println("Not Emirp Number");
    }
}