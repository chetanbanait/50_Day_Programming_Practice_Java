package com.Practice_Day_44;

class EngineComposition {

    void start() {
        System.out.println("Engine Started");
    }
}

class CarComposition {

    private EngineComposition engine;

    CarComposition() {
        engine = new EngineComposition();
    }

    void startCar() {
        engine.start();
        System.out.println("Car Started");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {

        CarComposition car =
                new CarComposition();

        car.startCar();
    }
}