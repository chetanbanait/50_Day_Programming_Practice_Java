package com.Practice_Day_43;

class GrandparentMulti {
    void house() {
        System.out.println("Grandparent House");
    }
}

class ParentMulti extends GrandparentMulti {
    void car() {
        System.out.println("Parent Car");
    }
}

class ChildMulti extends ParentMulti {
    void bike() {
        System.out.println("Child Bike");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        ChildMulti c = new ChildMulti();

        c.house();
        c.car();
        c.bike();
    }
}