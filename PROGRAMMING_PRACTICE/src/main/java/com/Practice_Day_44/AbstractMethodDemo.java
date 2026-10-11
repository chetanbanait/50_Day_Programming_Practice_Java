package com.Practice_Day_44;

abstract class ShapeAbstract {

    abstract void draw();
}

class CircleAbstract extends ShapeAbstract {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractMethodDemo {
    public static void main(String[] args) {

        CircleAbstract c = new CircleAbstract();

        c.draw();
    }
}