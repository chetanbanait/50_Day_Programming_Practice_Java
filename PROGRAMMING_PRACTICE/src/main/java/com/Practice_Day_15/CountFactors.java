package com.Practice_Day_15;

import java.util.Scanner;

public class CountFactors {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        int count=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }

        System.out.println("Total Factors = "+count);
    }
}