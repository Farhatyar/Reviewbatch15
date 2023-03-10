package com.syntax.review6;

public class Garden {
    public static void main(String[] args) {
  // accessing variables of Flower class
       Flower flower1=new Flower();
       flower1.name="Hibiscus";
       flower1.color="red";
       flower1.price=5;
 //accessing  methods of Flowers class
       flower1.bloom();
       flower1.smell();
       flower1.grow();

        System.out.println(" creating second obj of the flower class ");
       Flower flower2=new Flower();
       flower2.name="Rose";
       flower2.color="blue";
       flower2.price=65;
        //accessing  methods of Flowers class
       flower2.bloom();
       flower2.smell();
       flower2.grow();


       Flower flower3=new Flower();
    }
}
