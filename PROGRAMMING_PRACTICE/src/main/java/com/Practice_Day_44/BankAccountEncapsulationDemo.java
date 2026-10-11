package com.Practice_Day_44;

class SecureBankAccount {

    private double balance;

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountEncapsulationDemo {
    public static void main(String[] args) {

        SecureBankAccount account =
                new SecureBankAccount();

        account.deposit(5000);
        account.withdraw(1000);

        System.out.println("Balance: "
                + account.getBalance());
    }
}