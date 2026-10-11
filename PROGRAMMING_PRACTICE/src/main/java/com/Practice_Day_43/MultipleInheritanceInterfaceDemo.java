package com.Practice_Day_43;

interface PrintableDevice {
    void print();
}

interface ScannableDevice {
    void scan();
}

class MultiFunctionMachine
        implements PrintableDevice, ScannableDevice {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class MultipleInheritanceInterfaceDemo {
    public static void main(String[] args) {

        MultiFunctionMachine m =
                new MultiFunctionMachine();

        m.print();
        m.scan();
    }
}