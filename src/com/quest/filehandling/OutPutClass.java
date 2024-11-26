package com.quest.filehandling;

import java.io.*;
import java.io.FileOutputStream;

public class OutPutClass {
    public static void main(String[] a){
        try {
            String s1 = "hello world";
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"));
            bos.write(s1.getBytes());
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("destination.txt"));
            byte[] arr=new byte[1024];
            int c ;
            while ((c=bis.read(arr))!=-1){
                System.out.println((char) c);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
