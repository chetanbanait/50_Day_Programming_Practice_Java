package com.Practice_Day_44;

interface AnimalInterface {

    void sound();
}

class DogInterface implements AnimalInterface {

    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        DogInterface d = new DogInterface();

        d.sound();
    }
}