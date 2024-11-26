package com.quest.filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class StreamClassExample {
    public static void main(String[] args){
        try{
            File fileObj=new File("file1.txt");
            FileInputStream inputObj=new FileInputStream("file1.txt");
            FileOutputStream outputObj=new FileOutputStream(fileObj,true);
            Scanner sc=new Scanner(System.in);
            String s1;
            System.out.println("enter 5 sentences");
            for(int i=0;i<5;i++){
                s1=sc.nextLine();
                s1=s1+"\n";
                outputObj.write(s1.getBytes());
            }
            outputObj.close();
            int line;
            while((line=inputObj.read())!=-1){
                System.out.print((char)line);
            }
            inputObj.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
