package com.Practice_Day_47;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class Ex27InsufficientBalance {
    public static void main(String[] args) {
        double balance = 1000;
        double withdrawal = 1500;

        try {
            if (withdrawal > balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            balance -= withdrawal;
            System.out.println(balance);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}