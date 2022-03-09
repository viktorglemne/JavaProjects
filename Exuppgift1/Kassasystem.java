package Exuppgift1;

import java.util.Scanner;

public class Kassasystem {
    public static void main(String[] args) {
        // ger en datatyp till en variabel
        int kostnad, betalt, växel, x = 0, y = 0;
        int[] sedlar = {1000, 500, 200, 100, 50, 20, 2, 1};

        // läser in det som skrivs av användaren i konsol. För att kunna läsa av "bordet"
        Scanner input = new Scanner(System.in);
        // skriver ut text på nästa linje i konsol
        System.out.println("Pris på produkt: ");
        // ger värde åt variabeln kostnad
        kostnad = input.nextInt();

        System.out.println("Kunden betalar med: ");
        betalt = input.nextInt();

        // sätter vaiablernas värden i relation för uträkningen
        växel = betalt - kostnad;

        System.out.print("Kunden får tillbaka: ");

        // do while sats gör så att en funktion loopas till wkile är uppnått
        while (växel > 0) {
            // loopar ( ger värde till variabel; villkor för loop;
            // ökning eller minskning till variabelns värde)
            for (x = 0; x < sedlar.length; x++){
                // om växel är större än sedlar utför if annars gå vidare
                if (växel >= sedlar[x]);
                {
                    // loopar genom för att se hur många av den sedlen som behövs
                    for(y=0; växel >= sedlar[x]; y++){
                        // skriver ut svaret
                        System.out.print(sedlar[x] + ":- ");
                        // Tar bort värdet av index [x] på sedelarrayen
                        växel = växel - sedlar[x];
                    }
                }
            }
        }
    }
}