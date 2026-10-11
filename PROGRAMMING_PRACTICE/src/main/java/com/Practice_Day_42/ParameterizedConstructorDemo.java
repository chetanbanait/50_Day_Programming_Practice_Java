package com.Practice_Day_42;

class ParameterStudent {
    String name;
    int age;

    ParameterStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {

        ParameterStudent s =
                new ParameterStudent("Chetan", 24);

        s.display();
    }
}