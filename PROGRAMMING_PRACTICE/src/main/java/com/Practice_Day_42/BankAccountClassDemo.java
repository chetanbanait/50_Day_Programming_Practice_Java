package com.Practice_Day_42;

class BankAccountInfo {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountClassDemo {
    public static void main(String[] args) {

        BankAccountInfo account = new BankAccountInfo();

        account.accountHolder = "Chetan";
        account.balance = 5000;

        account.deposit(2000);

        account.displayBalance();
    }
}