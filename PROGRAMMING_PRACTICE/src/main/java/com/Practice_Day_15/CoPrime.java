package com.Practice_Day_15;

import java.util.Scanner;

public class CoPrime {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }

        if(a==1)
            System.out.println("Co-Prime");
        else
            System.out.println("Not Co-Prime");
    }
}
