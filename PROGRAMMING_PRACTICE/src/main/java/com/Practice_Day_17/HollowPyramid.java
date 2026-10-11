package com.Practice_Day_17;

public class HollowPyramid {

    public static void main(String[] args) {

        int rows=5;

        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++){

                if(j==1 || j==2*i-1 || i==rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}