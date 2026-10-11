package com.Practice_Day_44;

final class ImmutableStudent {

    private final String name;
    private final int age;

    ImmutableStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ImmutableClassDemo {
    public static void main(String[] args) {

        ImmutableStudent s =
                new ImmutableStudent("Chetan", 24);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
