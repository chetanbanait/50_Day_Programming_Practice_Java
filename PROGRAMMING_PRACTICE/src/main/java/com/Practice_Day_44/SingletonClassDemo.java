package com.Practice_Day_44;

class SingletonExample {

    private static SingletonExample object;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {

        if (object == null) {
            object = new SingletonExample();
        }

        return object;
    }

    void display() {
        System.out.println("Singleton Object");
    }
}

public class SingletonClassDemo {
    public static void main(String[] args) {

        SingletonExample obj =
                SingletonExample.getInstance();

        obj.display();
    }
}
