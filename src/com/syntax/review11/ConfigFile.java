package com.syntax.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {
        // location of the file
        String path="Files/Config.properties";
        //navigating to the file
        // whenever we hava to read the data from a file we use FileInputStream
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            /*
            this Properties class will assist us to read and write data to
             .properties files
             */
            Properties properties=new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("userName"));
        } catch (FileNotFoundException e) {
            System.out.println("something gone wrong");
        }catch (NullPointerException e){
            System.out.println("you are trying to call a method on Null object");
        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        }
    }
}
