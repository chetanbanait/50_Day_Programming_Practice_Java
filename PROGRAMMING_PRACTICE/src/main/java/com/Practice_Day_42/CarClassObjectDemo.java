package com.Practice_Day_42;

class CarInfo {
    String brand;
    String color;
    int price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

public class CarClassObjectDemo {
    public static void main(String[] args) {

        CarInfo car = new CarInfo();

        car.brand = "Toyota";
        car.color = "White";
        car.price = 800000;

        car.display();
    }
}
