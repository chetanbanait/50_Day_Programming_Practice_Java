package com.Practice_Day_43;

class ConstructorOverloadCar {

    ConstructorOverloadCar() {
        System.out.println("No details");
    }

    ConstructorOverloadCar(String brand) {
        System.out.println("Brand: " + brand);
    }

    ConstructorOverloadCar(String brand, int price) {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class ConstructorOverloadingInheritanceDemo {
    public static void main(String[] args) {

        new ConstructorOverloadCar();
        new ConstructorOverloadCar("Honda");
        new ConstructorOverloadCar("Toyota", 800000);
    }
}