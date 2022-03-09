package com.glemne;

import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cars[] cars = new Cars[2];
        String temp;

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter the car model: ");
            temp = in.next();
            cars[i] = new Cars();
            cars[i].setModel(temp);
        }
        for(int i = 0 ; i < cars.length; i++) {
            System.out.println("Model: " + cars[i].getModel());
        }
    }
}
