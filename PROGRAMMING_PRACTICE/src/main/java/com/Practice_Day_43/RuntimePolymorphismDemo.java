package com.Practice_Day_43;

class AnimalRuntime {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class DogRuntime extends AnimalRuntime {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

        AnimalRuntime animal = new DogRuntime();

        animal.sound();
    }
}