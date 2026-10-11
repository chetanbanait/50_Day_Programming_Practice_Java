package com.Practice_Day_49;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee58 {
    String name;
    double salary;

    Employee58(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Stream58HighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee58> employees = Arrays.asList(
            new Employee58("Amit", 30000),
            new Employee58("Neha", 50000),
            new Employee58("Rahul", 40000)
        );

        employees.stream()
            .max(Comparator.comparingDouble(e -> e.salary))
            .ifPresent(e -> System.out.println(e.name + " " + e.salary));
    }
}