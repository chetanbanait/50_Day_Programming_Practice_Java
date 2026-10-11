package com.Practice_Day_42;

class StaticBlockExample {

    static {
        System.out.println("Static Block Executed");
    }

    void display() {
        System.out.println("Display Method");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {

        StaticBlockExample obj = new StaticBlockExample();

        obj.display();
    }
}