package com.quest.filehandling;
import java.io.*;

public class StreamClass {
    public static void main(String[] argk) throws IOException {
        try {
            FileInputStream strmObj = new FileInputStream("source.txt");
            System.out.println("file created successfully");
            int c;
            String s1="input as streams";
            FileOutputStream outObj= new FileOutputStream("source.txt");  // if object created removes all contents
            outObj.write(s1.getBytes());
            outObj.write(strmObj.read());
            while ((c=strmObj.read())!=-1) {
                System.out.print((char)c);
            }
            System.out.println(strmObj.read());//output 104
            System.out.println("file stream operations completed");
            strmObj.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

