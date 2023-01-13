package com.syntax.review1;

public class Whatif {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //????///

        String c = "hello";
        String d = "Java";
        System.out.println(a + b + c + d);//30helloJava
        System.out.println(a+c+d+b); //10helloJava20

        System.out.println(c+d+a+b); //helloJava1020 ????
        System.out.println(c+d+(a+b)); //helloJava30

        //Arithmetic Operators: +,-,*,/,%
        

    }
}
