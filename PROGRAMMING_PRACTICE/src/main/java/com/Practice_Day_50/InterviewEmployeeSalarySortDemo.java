package com.Practice_Day_50;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InterviewEmployeeSalarySortDemo {
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String toString() {
            return name + " - " + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Amit", 40000));
        employees.add(new Employee("Rahul", 30000));
        employees.add(new Employee("Priya", 50000));

        employees.sort(Comparator.comparingDouble(e -> e.salary));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}