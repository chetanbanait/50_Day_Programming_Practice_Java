package com.Practice_Day_43;

class ShapeArea {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double width) {
        return length * width;
    }
}

public class ShapeAreaCalculatorDemo {
    public static void main(String[] args) {

        ShapeArea s = new ShapeArea();

        System.out.println("Circle Area: " + s.area(5));
        System.out.println("Rectangle Area: " + s.area(10, 5));
    }
}
