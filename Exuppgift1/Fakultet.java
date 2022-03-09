package Exuppgift1;

import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {
        // ger en datatyp till en variabel
        int x, y, svar = 1;

        // läser in det som skrivs av användaren i konsol. För att kunna läsa av "bordet"
        Scanner in = new Scanner (System.in);
            // skriver ut text på nästa linje i konsol
            System.out.println("Skirv ut nummer: ");
            // ger värde åt variabeln x
            x = in.nextInt();
        // loopar
        for (y=x;y>=1;y--) {
            svar = svar * y;
        }
        System.out.print("!= av " + x + " är: " + svar);
    }
}
