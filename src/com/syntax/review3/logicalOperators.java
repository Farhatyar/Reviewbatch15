package com.syntax.review3;

public class logicalOperators {
    public static void main(String[] args) {

        boolean loginbuttonDisplayed=true;
        boolean loginButtonClickable=true;

        if (loginbuttonDisplayed && loginButtonClickable){
            System.out.println("Test case is passed");
        }else {
            System.out.println("Test case failed");
        }

        System.out.println("****************************************");

        boolean dashboard=false;
        String massage="Welcome admin";
        if(dashboard || massage.equals("Welcome admin")){
            System.out.println(" User is successfully logged in");
        }else {
            System.out.println("User is not logged in");
        }

        System.out.println("********* LOGICAL OR****************");


        boolean b=true;
        System.out.println(!b);

        boolean agreeCheckboxSelected=false;
        if ((!agreeCheckboxSelected)){
            System.out.println(" I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");

    }


}
