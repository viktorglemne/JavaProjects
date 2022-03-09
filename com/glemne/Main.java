package com.glemne;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("belopp att betala: ");
        int number1 = input.nextInt();
        System.out.print("kund betalar med: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);}
        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);}
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);}
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);}
    }

}
