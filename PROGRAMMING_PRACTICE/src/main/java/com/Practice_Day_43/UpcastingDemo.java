package com.Practice_Day_43;

class ParentUpcasting {
    void display() {
        System.out.println("Parent Method");
    }
}

class ChildUpcasting extends ParentUpcasting {

    void childMethod() {
        System.out.println("Child Method");
    }
}

public class UpcastingDemo {
    public static void main(String[] args) {

        ParentUpcasting obj = new ChildUpcasting();

        obj.display();
    }
}