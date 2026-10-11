package com.Practice_Day_46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee15 {
    String name;
    double salary;

    Employee15(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Map15HighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee15> list = Arrays.asList(
            new Employee15("Amit", 30000),
            new Employee15("Neha", 50000),
            new Employee15("Rahul", 40000)
        );

        Employee15 highest = list.stream()
            .max(Comparator.comparingDouble(e -> e.salary))
            .orElse(null);

        if (highest != null) {
            System.out.println(highest.name + " " + highest.salary);
        }
    }
}