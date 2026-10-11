package com.Practice_Day_46;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee12 {
    int id;
    String name;

    Employee12(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Map12EmployeeComparator {
    public static void main(String[] args) {
        List<Employee12> list = new ArrayList<>();
        list.add(new Employee12(103, "Rahul"));
        list.add(new Employee12(101, "Amit"));
        list.add(new Employee12(102, "Neha"));

        list.sort(Comparator.comparing(e -> e.name));
        list.forEach(System.out::println);
    }
}
