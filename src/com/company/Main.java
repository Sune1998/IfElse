package com.company;

public class Main {

    public static void main(String[] args) {
        // eksempel paa brug af if, else og if else statements
        int a = 18;
        int b = 17;

        if (a < b) {
            System.out.println("Tillykke du kan få kørekort!");
        }

        else if (20> a){
            System.out.println("Du er for gammel"); }

        else {
            System.out.println("du må vente lidt endnu");
        }

        System.out.println("Her kommer et eksempel på switch");
        System.out.println("********************************");

/* Dette er eksempel på en switch der kan fortælle om user er gammel nok til at få kørekort, hvor at variablen alder betyder 18*/
        int alder = 4;
        switch (alder) {
            case 1:
                System.out.println("Du er for ung");
                break;

            case 2:
                System.out.println("Du er stadig for ung");
                break;

            case 3:
                System.out.println("Du er næste gammel nok");
                break;

            case 4:
                System.out.println("Tilykke du kan få kørekort");
                break;
        }


    }
}
