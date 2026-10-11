package com.Practice_Day_42;

class EmployeeInfo {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeClassObjectDemo {
    public static void main(String[] args) {

        EmployeeInfo e1 = new EmployeeInfo();

        e1.id = 101;
        e1.name = "Rahul";
        e1.salary = 30000;

        e1.display();
    }
}