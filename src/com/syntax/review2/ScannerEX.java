package com.syntax.review2;

import java.util.Scanner;

public class ScannerEX {

    public static void main(String[] args) {

       int num=10;
       num=11;

       // non prim   variable = scanner
       Scanner       Keyboard=new Scanner(System.in); //*** IM


        System.out.println(" please enter you age");
       int age=Keyboard.nextInt();  // to capture int values

        System.out.println("are you tired");
        boolean tired=Keyboard.nextBoolean();  // to capture boolean values

        System.out.println("what is you name");
       String name=Keyboard.next();  // tocapture string until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);


    }
}
