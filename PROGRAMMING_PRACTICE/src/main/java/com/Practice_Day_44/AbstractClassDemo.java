package com.Practice_Day_44;

abstract class AnimalAbstract {

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void sound();
}

class DogAbstract extends AnimalAbstract {

    void sound() {
        System.out.println("Dog Barks");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {

        DogAbstract d = new DogAbstract();

        d.eat();
        d.sound();
    }
}
