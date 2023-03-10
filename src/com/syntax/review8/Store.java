package com.syntax.review8;

public class Store {
    public static void main(String[] args) {
       Furniture chair=new Chair();
       chair.assemble();
       chair.comfort(); //runtime polymorphism

        Furniture table=new Table();
        table.assemble();
        table.comfort();//runtime polymorphism

        Table t=new Table();
        t.assemble();
        t.buildTable("wood");
        t.comfort();
    }
}
