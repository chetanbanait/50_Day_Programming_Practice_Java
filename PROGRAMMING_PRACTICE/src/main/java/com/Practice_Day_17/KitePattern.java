package com.Practice_Day_17;

public class KitePattern {

    public static void main(String[] args) {

        int n=5;

        for(int i=1;i<=n;i++){

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            System.out.println("*");
        }

        for(int i=n-1;i>=1;i--){

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            System.out.println("*");
        }
    }
}