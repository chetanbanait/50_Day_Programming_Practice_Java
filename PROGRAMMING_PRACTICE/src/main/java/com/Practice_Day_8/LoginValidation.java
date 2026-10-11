package com.Practice_Day_8;

import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals("admin") &&
            password.equals("1234")) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Invalid Username or Password");
        }
    }
}