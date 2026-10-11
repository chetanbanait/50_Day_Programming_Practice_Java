package com.Practice_Day_47;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class Ex28InvalidMarks {
    public static void main(String[] args) {
        int marks = 120;

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be 0 to 100");
            }
            System.out.println("Valid marks");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}