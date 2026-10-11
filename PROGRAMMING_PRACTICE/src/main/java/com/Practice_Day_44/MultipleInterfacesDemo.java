package com.Practice_Day_44;

interface CameraFeature {
    void camera();
}

interface MusicFeature {
    void music();
}

class SmartPhoneFeature
        implements CameraFeature, MusicFeature {

    public void camera() {
        System.out.println("Camera Opened");
    }

    public void music() {
        System.out.println("Music Playing");
    }
}

public class MultipleInterfacesDemo {
    public static void main(String[] args) {

        SmartPhoneFeature phone =
                new SmartPhoneFeature();

        phone.camera();
        phone.music();
    }
}
