package com.Practice_Day_42;

class DefaultStudent {
    String name;
    int age;

    DefaultStudent() {
        name = "Unknown";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {

        DefaultStudent s = new DefaultStudent();

        s.display();
    }
}