package com.syntax.review7;

public class Tesla extends Car {
    String type;
    boolean autoPilot;

    public Tesla(String make, String model, int year, int horsePower,
                 String type, boolean autoPilot){

        super(make,model,year,horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }
    protected  void haveAutopilot(){
        System.out.println(make+" have auto pilot "+autoPilot);
    }
    public void start(){

    }

    public void havaAutopilot() {
    }
    // Overriding - is when we have same method name in 2 DIFFERENT class (parent -child)
    // In Overriding -INHERITANCE IS A MUST
    // in overriding method signature should be SAME
}
