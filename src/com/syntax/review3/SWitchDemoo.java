package com.syntax.review3;

public class SWitchDemoo {
    public static void main(String[] args) {
        int worldCup=2026;

        switch (worldCup){

            case 2022:
                System.out.println("winner is Argentiana");
                break;

            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;

            default:
                System.out.println("Winner is unknown");
        }
    }
}
