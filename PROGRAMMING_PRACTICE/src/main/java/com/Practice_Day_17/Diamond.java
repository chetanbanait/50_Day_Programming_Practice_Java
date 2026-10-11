package com.Practice_Day_17;

public class Diamond {

    public static void main(String[] args) {

        int rows=5;

        //Upper

        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }

        //Lower

        for(int i=rows-1;i>=1;i--){

            for(int j=1;j<=rows-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }

    }
}