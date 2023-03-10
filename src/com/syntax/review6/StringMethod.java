package com.syntax.review6;

public class StringMethod {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.length()); //5
        System.out.println(str.toUpperCase()); //HELLO
        System.out.println(str.toLowerCase()); //hello
        System.out.println(str.charAt(3));      //l

        String newString=str.concat(" friends");
        System.out.println(newString); //HEllo friends
        System.out.println(str); //Hello

        // check if length of the String is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);

        String str1=" Review B15  ";
       String newStr1=str1.trim();
        System.out.println(str);
        System.out.println(newStr1);
    }
}
