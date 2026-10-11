package com.Practice_Day_42;

class StaticStudent {

    String name;
    static String college = "DMIHER";

    StaticStudent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {

        StaticStudent s1 = new StaticStudent("Chetan");
        StaticStudent s2 = new StaticStudent("Rahul");

        s1.display();
        s2.display();
    }
}
