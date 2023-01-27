package com.syntax.review4;

public class Moreloops {
    public static void main(String[] args) {
        // what is the output?
        for (int i = 0; i <= 3; i++) {
            System.out.println(i); //0 1 2 3
            for (int j = 1; j >= 3; j++) {
                System.out.println(j);

            }

        }
        System.out.println("------------------------");

        for (int i = 0; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(i+" ");
                System.out.println();
            }
        }
    }
}
