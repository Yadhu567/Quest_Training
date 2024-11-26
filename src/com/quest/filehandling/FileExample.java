package com.quest.filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        File fileObj = new File("file1.txt");
        try {
            if (fileObj.createNewFile()||fileObj.exists()) {
                FileWriter fileWrtObj = new FileWriter(fileObj);
                fileWrtObj.write("hello world");
                fileWrtObj.close();
                Scanner sc = new Scanner(fileObj);
                while (sc.hasNextLine()) {
                    String s1 = sc.nextLine();
                    System.out.println(s1);
                }
                sc.close();
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           fileObj.delete();
        }
    }
}
