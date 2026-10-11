package com.Practice_Day_42;

class CopyStudent {

    String name;
    int marks;

    CopyStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    CopyStudent(CopyStudent s) {
        this.name = s.name;
        this.marks = s.marks;
    }

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {

        CopyStudent s1 = new CopyStudent("Chetan", 90);

        CopyStudent s2 = new CopyStudent(s1);

        s1.display();
        s2.display();
    }
}