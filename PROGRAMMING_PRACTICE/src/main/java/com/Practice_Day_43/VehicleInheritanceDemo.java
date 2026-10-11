package com.Practice_Day_43;

class VehicleSystem {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class CarSystem extends VehicleSystem {

    void drive() {
        System.out.println("Car is Driving");
    }
}

class BikeSystem extends VehicleSystem {

    void ride() {
        System.out.println("Bike is Riding");
    }
}

public class VehicleInheritanceDemo {
    public static void main(String[] args) {

        CarSystem car = new CarSystem();
        car.start();
        car.drive();

        BikeSystem bike = new BikeSystem();
        bike.start();
        bike.ride();
    }
}