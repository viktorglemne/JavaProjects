package com.glemne;

import java.util.Scanner;

public class omvandlare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String svar;
        double kurs;
        double pris;
        System.out.println("Ange ny dagskurs (J/N): " );
        svar = in.nextLine();
        if (svar.equals("j")){
            System.out.println("mata in aktuell kurs: ");
            kurs = in.nextDouble();
        } else kurs = 10;
        System.out.println("pris i sek");
        pris = input.nextDouble();

        double euro = kurs;

        pris = pris / euro;

        System.out.println("priset i euro: " + pris);
    }


}
