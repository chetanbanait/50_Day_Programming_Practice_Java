package com.Practice_Day_43;

class ParentDowncasting {
    void parentMethod() {
        System.out.println("Parent Method");
    }
}

class ChildDowncasting extends ParentDowncasting {

    void childMethod() {
        System.out.println("Child Method");
    }
}

public class DowncastingDemo {
    public static void main(String[] args) {

        ParentDowncasting p = new ChildDowncasting();

        ChildDowncasting c = (ChildDowncasting) p;

        c.parentMethod();
        c.childMethod();
    }
}