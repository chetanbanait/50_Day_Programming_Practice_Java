package com.Practice_Day_43;

class AnimalHierarchy {
    void eat() {
        System.out.println("Animal eats");
    }
}

class DogHierarchy extends AnimalHierarchy {
    void bark() {
        System.out.println("Dog barks");
    }
}

class CatHierarchy extends AnimalHierarchy {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        DogHierarchy d = new DogHierarchy();
        d.eat();
        d.bark();

        CatHierarchy c = new CatHierarchy();
        c.eat();
        c.meow();
    }
}