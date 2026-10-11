package com.Practice_Day_48;

import java.io.File;
import java.io.IOException;

public class File31CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        System.out.println(file.createNewFile()
            ? "File created" : "File already exists");
    }
}