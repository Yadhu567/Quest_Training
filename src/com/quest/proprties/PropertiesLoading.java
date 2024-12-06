package com.quest.proprties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoading {
    public static void main(String[] args) {
        Properties loadProperties=new Properties();
        try(FileInputStream fileinput=new FileInputStream("config.properties")){
            loadProperties.load(fileinput);
            System.out.println("db url: "+loadProperties.getProperty("database.url"));
            System.out.println("db username: "+loadProperties.getProperty("database.user"));
            System.out.println("db pswrd: "+loadProperties.getProperty("database.password"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
