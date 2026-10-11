package com.Practice_Day_46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee11 implements Comparable<Employee11> {
    int id;
    String name;

    Employee11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee11 e) {
        return Integer.compare(this.id, e.id);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Map11EmployeeComparable {
    public static void main(String[] args) {
        List<Employee11> list = new ArrayList<>();
        list.add(new Employee11(103, "Amit"));
        list.add(new Employee11(101, "Neha"));
        list.add(new Employee11(102, "Rahul"));

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
