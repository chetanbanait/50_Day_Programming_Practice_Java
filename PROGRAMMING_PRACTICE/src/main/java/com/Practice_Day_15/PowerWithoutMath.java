package com.Practice_Day_15;

import java.util.Scanner;

public class PowerWithoutMath {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int base=sc.nextInt();
        int exponent=sc.nextInt();

        int ans=1;

        while(exponent>0)
        {
            ans=ans*base;
            exponent--;
        }

        System.out.println(ans);
    }
}