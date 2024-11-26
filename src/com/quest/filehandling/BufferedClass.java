package com.quest.filehandling;

import java.io.*;

public class BufferedClass {
    public static void main(String[] ar)  {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"));
            byte[] arr=new byte[1024];
            int c;
            while((c= bis.read(arr))!=-1){
                System.out.println((char)c);
                bos.write(arr,0,c);
            }
            bos.flush();
            bos.close();
            bis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
