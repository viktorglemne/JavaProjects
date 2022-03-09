package Exuppgift1;

import java.util.Scanner;
import java.util.ArrayList;

public class Kassasystem3 {
    public static void main(String[] args) {

        int count = 0;
        int amount = count;
        int arryNum[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("Kostnad: ");
        count = input.nextInt();

        if (count >= 0) {
            System.out.println("Kunden betalar: ");
            amount = in.nextInt(); // för att ge ett värde till amount


        }
        if (amount >= count) {
            System.out.println("kund får tillbaka " +
                    (amount - count) + "kr");
        } else System.out.println("Medges ej");

    }

    // små fabriker
    //public static int valuta[]


       // valuta = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        // return valuta;

}

