package com.Practice_Day_43;

class AnimalSingle {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class DogSingle extends AnimalSingle {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        DogSingle d = new DogSingle();

        d.eat();
        d.bark();
    }
}
