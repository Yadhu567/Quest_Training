package com.quest.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        File fileObject = new File("file2.txt");
        try {
            System.out.println("try started");
            if (fileObject.exists()) {
                Scanner sc = new Scanner(fileObject);
                int count = 0;
                while (sc.hasNextLine()) {
                    String s1 = sc.nextLine();
                    System.out.println(s1);
                    count++;
                    if (count == 2) {
                        break;
                    }
                }
                sc.close();
                System.out.println("file created successfully");
                System.out.println("try ended");
            } else {
                System.out.println("file not found");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fileObject.delete();
            System.out.println("file deletion successfully");
        }
    }
}
