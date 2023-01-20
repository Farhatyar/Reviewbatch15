package com.syntax.review4;

public class forloop {
    public static void main(String[] args) {

        // best loop - used when we know  how many times we want to repeat block of code

        for (int i = 2; i < +20; i += 5) {
            System.out.println(i);
            System.out.println("-------------------------------+");
        }
        // break and continue

        for (int i = 2; i < +20; i += 5) {
            System.out.println(i);
            if(i==12){
                System.out.println("I  is equal to 12 - I am breaking my loop");
                break;
            }
        }
        // continue - skips current interation
        for (int i = 1; i <=10 ; i++) {
            if (i%3==0){
                System.out.println(i);
                continue; // java goes back to the beginning of the loop
                // and skips the rest of the code that is inside loop body
            }
            System.out.println("Hello");
            System.out.println("how are you");
            System.out.println("Hope you well");

        }
    }
}