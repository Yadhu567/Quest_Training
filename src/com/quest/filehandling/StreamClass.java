package com.quest.filehandling;
import java.io.*;


public class StreamClass {
    public static void main(String[] argk) throws IOException {
        try {
            FileInputStream strmObj = new FileInputStream("source.txt");
            System.out.println("file created successfully");
            int c;
            String s1="input as streams";
            ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("s.txt"));

            FileOutputStream outObj= new FileOutputStream("source.txt",true);  // if object created removes all contents
            outObj.write(s1.getBytes());
            outObj.write(strmObj.read()); //return byte array
            while ((c=strmObj.read())!=-1) { //return individual integer
                System.out.print((char)c);
            }

            System.out.println(strmObj.read());//output 104
            System.out.println("file stream operations completed");
            strmObj.close();
            outObj.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

