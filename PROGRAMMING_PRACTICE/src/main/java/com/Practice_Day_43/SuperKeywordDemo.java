package com.Practice_Day_43;

class ParentSuper {
    int number = 100;

    void display() {
        System.out.println("Parent Method");
    }
}

class ChildSuper extends ParentSuper {

    int number = 200;

    void show() {
        System.out.println("Child Number: " + number);
        System.out.println("Parent Number: " + super.number);

        super.display();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {

        ChildSuper c = new ChildSuper();

        c.show();
    }
}
