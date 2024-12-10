package com.quest.multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileProcessingClass implements Runnable {
    private String fileName;

    public FileProcessingClass(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try  {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class FileProcessorClass {
    public static void main(String[] args) {
        FileProcessingClass firstFile = new FileProcessingClass("first.txt");
        FileProcessingClass secondFile = new FileProcessingClass("second.txt");

        Thread t1 = new Thread(firstFile);
        Thread t2 = new Thread(secondFile);

        t1.start();

        t2.start();
    }
}
