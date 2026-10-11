package com.Practice_Day_43;

class ParentOverride {
    void show() {
        System.out.println("Parent Method");
    }
}

class ChildOverride extends ParentOverride {

    @Override
    void show() {
        System.out.println("Child Method");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        ChildOverride c = new ChildOverride();

        c.show();
    }
}