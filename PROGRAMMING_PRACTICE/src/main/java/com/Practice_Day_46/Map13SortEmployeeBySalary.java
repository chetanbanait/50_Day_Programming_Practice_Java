package com.Practice_Day_46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee13 {
    String name;
    double salary;

    Employee13(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " : " + salary;
    }
}

public class Map13SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee13> list = Arrays.asList(
            new Employee13("Amit", 30000),
            new Employee13("Neha", 45000),
            new Employee13("Rahul", 25000)
        );

        list.sort(Comparator.comparingDouble(e -> e.salary));
        list.forEach(System.out::println);
    }
}