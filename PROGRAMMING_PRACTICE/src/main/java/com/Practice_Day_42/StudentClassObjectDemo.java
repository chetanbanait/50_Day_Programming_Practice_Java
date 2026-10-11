package com.Practice_Day_42;

class StudentInfo {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentClassObjectDemo {
    public static void main(String[] args) {

        StudentInfo s1 = new StudentInfo();

        s1.name = "Chetan";
        s1.age = 24;
        s1.marks = 85;

        s1.display();
    }
}