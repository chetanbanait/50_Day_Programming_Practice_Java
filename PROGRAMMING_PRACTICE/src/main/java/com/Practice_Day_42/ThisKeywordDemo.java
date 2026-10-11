package com.Practice_Day_42;

class ThisStudent {

    String name;
    int age;

    ThisStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {

        ThisStudent s = new ThisStudent("Chetan", 24);

        s.display();
    }
}