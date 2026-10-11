package com.Practice_Day_44;

class DepartmentAggregation {

    String name;

    DepartmentAggregation(String name) {
        this.name = name;
    }
}

class CollegeAggregation {

    String collegeName;
    DepartmentAggregation department;

    CollegeAggregation(String collegeName,
                       DepartmentAggregation department) {
        this.collegeName = collegeName;
        this.department = department;
    }

    void display() {
        System.out.println("College: " + collegeName);
        System.out.println("Department: " + department.name);
    }
}

public class AggregationDemo {
    public static void main(String[] args) {

        DepartmentAggregation dept =
                new DepartmentAggregation("Computer Science");

        CollegeAggregation college =
                new CollegeAggregation("DMIHER", dept);

        college.display();
    }
}