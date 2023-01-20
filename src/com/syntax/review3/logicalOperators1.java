package com.syntax.review3;

public class logicalOperators1 {
    public static void main(String[] args) {

        boolean loginbuttonDisplayed=true;
        boolean loginButtonClickable=false;

        if (loginbuttonDisplayed && loginButtonClickable){
            System.out.println("Test case is passed");
        }else {
            System.out.println("Test case failed");
        }

    }

}
