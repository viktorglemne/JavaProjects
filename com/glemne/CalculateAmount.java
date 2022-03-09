package com.glemne;

import java.util.Scanner;

public class CalculateAmount {
    public static void main(String[] args) {
        Float sum = 0.0f;
        System.out.println("skriv in köpesumma: ");
        Scanner input = new Scanner(System.in);
        sum = input.nextFloat();
        if (sum>=1000){
            sum = (float) (sum * 0.9);

        }
        System.out.println("summa att betala: " + sum);
    }
}
