package com.glemne;

import java.util.Scanner;

public class Amount2 {
    public static void main(String[] args) {
        float sum = 0.0f;
        do {
            System.out.print("Skriv in köpesumman: ");
            Scanner input = new Scanner(System.in);
            sum = input.nextFloat();

            if (sum>=1000){
                sum = (float) (sum * 0.9);
            }
            System.out.println("Summa att betala: " + sum);
        }while(!(sum == 0));


        /* for(int x = 0; x < 10; x++){
            System.out.println("Varv: " + x);
        } */
    }
}



