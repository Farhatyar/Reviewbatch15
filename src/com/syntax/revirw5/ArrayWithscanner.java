package com.syntax.revirw5;

import java.util.Scanner;

public class ArrayWithscanner {
    public static void main(String[] args) {
        // let's create an array of names using scanner
        Scanner scan=new Scanner(System.in);
        System.out.println("How many names you want to store");
        int size=scan.nextInt();
        String[] name=new  String[size];
        // this loop stores elements inside the aray
        //regular for loop work with indexes
        for (int i=0; i<name.length; i++){
            System.out.println("please Enter name");
            name[i]=scan.next();
        }
        //using loop below we can retrieve element
        // enhanced for loop work with variable
        for (String n:name){
            System.out.println(n);
        }

    }
}
