package com.Practice_Day_49;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee57 {
    String name;
    double salary;

    Employee57(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " : " + salary;
    }
}

public class Stream57SortEmployeesBySalary {
    public static void main(String[] args) {
        List<Employee57> employees = Arrays.asList(
            new Employee57("Amit", 30000),
            new Employee57("Neha", 50000),
            new Employee57("Rahul", 40000)
        );

        employees.stream()
            .sorted(Comparator.comparingDouble(e -> e.salary))
            .forEach(System.out::println);
    }
}