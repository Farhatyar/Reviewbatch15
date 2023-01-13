package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {
        /* if Statement
        if(boolean condition){
        code A;
        }else{
        code B
        }
         */
        int num = 11;

        if (num > 100) {
            System.out.println(num + " is greater then a 100");
        } else {
            System.out.println(num + " is less than a 100");
        }


        String Button = "Erroll Today";

        if (Button.equals("Erroll Today")) {
            System.out.println("TEst Case Pass");
        } else {
            System.out.println("test case failes");
        }
        

    }

}
