package com.Practice_Day_15;

import java.util.Scanner;

public class PerfectCube {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int cube=(int)Math.round(Math.cbrt(n));

        if(cube*cube*cube==n)
            System.out.println("Perfect Cube");
        else
            System.out.println("Not Perfect Cube");
    }
}