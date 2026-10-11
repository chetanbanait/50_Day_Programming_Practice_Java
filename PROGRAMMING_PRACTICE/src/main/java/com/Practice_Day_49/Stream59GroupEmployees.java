package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee59 {
    String name, department;

    Employee59(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class Stream59GroupEmployees {
    public static void main(String[] args) {
        List<Employee59> employees = Arrays.asList(
            new Employee59("Amit", "IT"),
            new Employee59("Neha", "HR"),
            new Employee59("Rahul", "IT")
        );

        Map<String, List<Employee59>> result = employees.stream()
            .collect(Collectors.groupingBy(e -> e.department));

        System.out.println(result);
    }
}