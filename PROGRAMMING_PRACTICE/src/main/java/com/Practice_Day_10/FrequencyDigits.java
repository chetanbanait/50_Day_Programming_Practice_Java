package com.Practice_Day_10;

import java.util.Scanner;

public class FrequencyDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] freq = new int[10];

        while (num != 0) {
            int digit = num % 10;
            freq[digit]++;
            num = num / 10;
        }

        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " = " + freq[i]);
            }
        }
    }
}