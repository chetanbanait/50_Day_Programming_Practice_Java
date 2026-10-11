package com.Practice_Day_42;

class StudentManagementInfo {

    int id;
    String name;
    int marks;

    StudentManagementInfo(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class StudentManagementDemo {
    public static void main(String[] args) {

        StudentManagementInfo s =
                new StudentManagementInfo(101, "Chetan", 85);

        s.display();
    }
}