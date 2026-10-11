package com.Practice_Day_47;

class InvalidSalaryException extends Exception {
    InvalidSalaryException(String msg) {
        super(msg);
    }
}

public class Ex30EmployeeSalary {
    public static void main(String[] args) {
        double salary = -5000;

        try {
            if (salary < 0) {
                throw new InvalidSalaryException("Salary cannot be negative");
            }
            System.out.println(salary);
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}