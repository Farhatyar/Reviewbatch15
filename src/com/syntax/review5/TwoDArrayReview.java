package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int [][] array={
                {1,2,3,},     //0
                {11,12,13},   //1
                {20,21,22},   //2
                {100,1}       //3
        };
        // grtting all values from 2D array using regular for loop

        for (int row=0; row<array.length; row++){// outrt loops inerates over rows
            for (int col=0; col<array[row].length; col++){// iterates over each column

                // I want to print values only from odd rows
                if(row%2!=0){
                    System.out.println(array[row][col]+"");
                }
            }
            System.out.println();
        }



        System.out.println("*************************");
        // grtting all values from 2D array


        for (int[] arr:array){

            for (int num:arr){
                if (num%2==0){
                    System.out.print(num+" ");
                }
            }
            System.out.println();
        }



        System.out.println("**************************");
        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsIn1Array=array[0].length;
        System.out.println(numberOfElementsIn1Array);

        int numberOFElemeentsIn4Array=array[3].length;
        System.out.println(numberOFElemeentsIn4Array);

        // access 21
        System.out.println(array[2][1]);

    }
}
