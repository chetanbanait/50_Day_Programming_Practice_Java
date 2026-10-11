package com.Practice_Day_42;

class ConstructorEmployee {

    ConstructorEmployee() {
        System.out.println("Default Constructor");
    }

    ConstructorEmployee(String name) {
        System.out.println("Employee Name: " + name);
    }

    ConstructorEmployee(String name, int salary) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {

        new ConstructorEmployee();
        new ConstructorEmployee("Rahul");
        new ConstructorEmployee("Amit", 40000);
    }
}
