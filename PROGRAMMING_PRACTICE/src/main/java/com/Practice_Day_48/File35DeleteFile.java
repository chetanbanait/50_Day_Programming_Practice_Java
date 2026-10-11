package com.Practice_Day_48;

import java.io.File;

public class File35DeleteFile {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not found or deletion failed");
        }
    }
}