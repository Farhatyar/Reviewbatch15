package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        Bmw bmw=new Bmw("Bmw","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();

     Car car=new Car("someCar","someModel");
     car.start();
     car.drive(90);

        Tesla tesla= new Tesla("Tesle","s",2023,
                350,"electric",true);
        tesla.start();
        tesla.drive(75);
        tesla.havaAutopilot();
    }
}
