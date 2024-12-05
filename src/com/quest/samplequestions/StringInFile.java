package com.quest.samplequestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringInFile {
    public static void main(String[] args)  {
        try {
            File fileObject = new File("input file.txt");
            String inputString="hello";
            if (fileObject.exists()) {
                Scanner sc = new Scanner(fileObject);
                boolean flag=false;
                while(sc.hasNextLine()){
                    String str=sc.nextLine();
                    if(inputString.equalsIgnoreCase(str)){
                        flag=true;
                    }
                }
                sc.close();
                if(flag){
                    System.out.println("input string "+inputString+" found ");
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Exception occurred "+e.getMessage());
        }
    }
}
