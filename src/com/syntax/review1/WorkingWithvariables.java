package com.syntax.review1;

public class WorkingWithvariables {

    public static void main(String[] args) {

        // create a variable and store value into it
        // declared a variable and initialized it
        int number=10;

        // declared a variable
        int num; // declaration of a variable happens only once
        num=100; // initialion the variable
        num=200; // reassign the value;
        System.out.println(num); //200

        boolean hungry=false;
        hungry=true;

         // String is the most popular datatype
          String myString="hello";
          String name="asel";
          String address="123 test Drive";


          //hello jan
        System.out.println(myString+"  "+name);


        int age=21;
        System.out.println(name+" is "+ age +" years old");

        /* if we want to attach string to anything;
        string to anther string
        string to anther int
        string to anther boolean
        string to anther char.....

        we use +--> acts as concatenation
         */

        //when we haev 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;


        // 14 December
        System.out.println( day+"  "+month);


        char date='1';
        System.out.println(date+"  "+month);
        System.out.println(date+day);



    }
}
