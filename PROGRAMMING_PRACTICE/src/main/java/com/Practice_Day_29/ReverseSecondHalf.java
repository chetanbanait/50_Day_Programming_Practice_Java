package com.Practice_Day_29;

import java.util.Scanner;

public class ReverseSecondHalf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int mid = str.length() / 2;

        String first = str.substring(0, mid);
        String second = str.substring(mid);

        String reverse = "";

        for (int i = second.length() - 1; i >= 0; i--) {
            reverse = reverse + second.charAt(i);
        }

        System.out.println(first + reverse);
    }
}