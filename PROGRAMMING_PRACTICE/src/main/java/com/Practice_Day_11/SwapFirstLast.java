package com.Practice_Day_11;

import java.util.Scanner;

public class SwapFirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        char[] arr = num.toCharArray();

        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println(new String(arr));
    }
}