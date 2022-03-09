package com.glemne;

import java.util.Scanner;

public class ovningsuppgift {
    public static void main(String[] args) {
        int tal1, tal2, tal3, produkt;
        Scanner input = new Scanner(System.in);
        System.out.println("Ange ett värde för första talet: ");
        tal1 = input.nextInt();

        System.out.println("Ange ett värde för andra talet: ");
        tal2 = input.nextInt();

        System.out.println("Ange ett värde för tredje talet: ");
        tal3 = input.nextInt();

        produkt = tal1 * tal2 * tal3;
        System.out.println(produkt);


    }

}
