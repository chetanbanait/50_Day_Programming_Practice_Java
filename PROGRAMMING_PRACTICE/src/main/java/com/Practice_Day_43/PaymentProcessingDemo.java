package com.Practice_Day_43;

class PaymentProcess {

    void pay() {
        System.out.println("Payment Processing");
    }
}

class UpiPayment extends PaymentProcess {

    @Override
    void pay() {
        System.out.println("Payment using UPI");
    }
}

class CardPayment extends PaymentProcess {

    @Override
    void pay() {
        System.out.println("Payment using Card");
    }
}

public class PaymentProcessingDemo {
    public static void main(String[] args) {

        PaymentProcess payment;

        payment = new UpiPayment();
        payment.pay();

        payment = new CardPayment();
        payment.pay();
    }
}