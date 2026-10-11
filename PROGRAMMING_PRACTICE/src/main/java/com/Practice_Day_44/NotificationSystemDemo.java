package com.Practice_Day_44;

interface NotificationService {

    void sendNotification();
}

class EmailNotification implements NotificationService {

    public void sendNotification() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification implements NotificationService {

    public void sendNotification() {
        System.out.println("SMS Notification Sent");
    }
}

class WhatsAppNotification implements NotificationService {

    public void sendNotification() {
        System.out.println("WhatsApp Notification Sent");
    }
}

public class NotificationSystemDemo {
    public static void main(String[] args) {

        NotificationService notification;

        notification = new EmailNotification();
        notification.sendNotification();

        notification = new SMSNotification();
        notification.sendNotification();

        notification = new WhatsAppNotification();
        notification.sendNotification();
    }
}
