package com.quest.filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperaions2 {
    public static void main(String[] args){
        try {
            FileWriter fileObject = new FileWriter("file1.txt");
            fileObject.write("hello world, file writer example");
            fileObject.append('o');
            CharSequence charSq=new CharSequence() {
                @Override
                public int length() {
                    return 0;
                }

                @Override
                public char charAt(int index) {
                    return 0;
                }

                @Override
                public CharSequence subSequence(int start, int end) {
                    return null;
                }

                @Override
                public String toString() {
                    return "hello";
                }
            };
            fileObject.append(charSq);
            fileObject.append("char sequence",1,13);
            fileObject.close();
            System.out.println("file operations completed successfully");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
