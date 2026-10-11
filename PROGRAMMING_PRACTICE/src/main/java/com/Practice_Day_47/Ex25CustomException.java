package com.Practice_Day_47;

class InvalidUserException extends Exception {
    InvalidUserException(String message) {
        super(message);
    }
}

public class Ex25CustomException {
    public static void main(String[] args) {
        try {
            throw new InvalidUserException("Invalid user");
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
    }
}
