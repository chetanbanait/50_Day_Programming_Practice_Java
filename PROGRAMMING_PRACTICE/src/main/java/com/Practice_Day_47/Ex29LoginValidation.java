package com.Practice_Day_47;

class InvalidLoginException extends Exception {
    InvalidLoginException(String msg) {
        super(msg);
    }
}

public class Ex29LoginValidation {
    public static void main(String[] args) {
        String username = "chetan";
        String password = "1234";

        try {
            if (!username.equals("admin") ||
                !password.equals("admin123")) {
                throw new InvalidLoginException("Invalid credentials");
            }
            System.out.println("Login successful");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
