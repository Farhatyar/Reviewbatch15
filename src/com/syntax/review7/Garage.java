package com.syntax.review7;

public class Garage {
    public static void main(String[] args) {
      Tesla tesla=new Tesla("Tesla","S",2022,
              340,"electric",true);

      tesla.start();// from super class
        tesla.drive(100);
        //from tesla class -subclass
        tesla.haveAutopilot();
        tesla.drive(Integer.parseInt("Miami"));

    }
}
