package com.Practice_Day_49;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee60 {
    String name, department;
    double salary;

    Employee60(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class Stream60AverageSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee60> employees = Arrays.asList(
            new Employee60("Amit", "IT", 30000),
            new Employee60("Rahul", "IT", 50000),
            new Employee60("Neha", "HR", 40000)
        );

        Map<String, Double> result = employees.stream()
            .collect(Collectors.groupingBy(
                e -> e.department,
                Collectors.averagingDouble(e -> e.salary)));

        System.out.println(result);
    }
}
