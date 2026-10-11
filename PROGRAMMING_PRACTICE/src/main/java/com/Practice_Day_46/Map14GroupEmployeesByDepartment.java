package com.Practice_Day_46;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee14 {
    String name, department;

    Employee14(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class Map14GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee14> list = Arrays.asList(
            new Employee14("Amit", "IT"),
            new Employee14("Neha", "HR"),
            new Employee14("Rahul", "IT")
        );

        Map<String, List<Employee14>> groups = list.stream()
            .collect(Collectors.groupingBy(e -> e.department));

        groups.forEach((dept, employees) -> {
            System.out.println(dept);
            employees.forEach(e -> System.out.println(e.name));
        });
    }
}
