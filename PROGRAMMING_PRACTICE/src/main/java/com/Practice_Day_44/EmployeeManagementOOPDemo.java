package com.Practice_Day_44;

class OOPEmployee {

    private int id;
    private String name;
    private double salary;

    OOPEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void increaseSalary(double amount) {
        salary = salary + amount;
    }
}

public class EmployeeManagementOOPDemo {
    public static void main(String[] args) {

        OOPEmployee employee =
                new OOPEmployee(101, "Chetan", 30000);

        System.out.println("Before Salary Increase:");

        employee.display();

        employee.increaseSalary(5000);

        System.out.println("\nAfter Salary Increase:");

        employee.display();
    }
}
