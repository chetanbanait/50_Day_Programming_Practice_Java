package com.Practice_Day_29;

import java.util.Scanner;

public class ReverseUsingCharacterArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}