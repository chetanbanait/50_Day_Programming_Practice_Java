package com.Practice_Day_50;

class DatabaseConnection {
    private static final DatabaseConnection INSTANCE =
            new DatabaseConnection();

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Database connected");
    }
}

public class SingletonClassDemo {
    public static void main(String[] args) {
        DatabaseConnection obj1 = DatabaseConnection.getInstance();
        DatabaseConnection obj2 = DatabaseConnection.getInstance();

        obj1.connect();

        System.out.println("Same object: " + (obj1 == obj2));
    }
}