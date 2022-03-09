package com.glemne;

import java.util.Scanner;
import java.lang.Math.*;

public class IfOvning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int kakelplattor = 32;
        final int kakelfix = 5;
        final int kakelfog = 3;

        Arbete:
        while (true) {
            System.out.println("Vad för arbete ska göras?");
            System.out.println("skriv B för badrum");
            System.out.println("skriv H för hall");
            System.out.println("skriv K för kök");
            String arbete = in.nextLine();
            if (arbete.equals("B")) {
                System.out.println("hur många kvadratmeter är arbetet");
                double m2 = in.nextDouble();
                System.out.println("Du behöver " + Math.ceil(((15 * m2) / (kakelplattor))) + "st paket med kakelplattor,");
                System.out.print(Math.ceil(((0.7 * m2) / (kakelfix))) + "st paket med kakelfix");
                System.out.println("och " + Math.ceil(((0.4 * m2) / (kakelfog))) + "st paket med kakelfog");
                break;
            } else if (arbete.equals("H")) {
                System.out.println("hur många kvadratmeter är arbetet");
                double m2 = in.nextDouble();
                System.out.println("Du behöver " + Math.ceil(((8 * m2) / (kakelplattor))) + "st paket med kakelplattor,");
                System.out.print(Math.ceil(((0.3 * m2) / (kakelfix))) + "st paket med kakelfix");
                System.out.println("och " + Math.ceil(((0.25 * m2) / (kakelfog))) + "st paket med kakelfog");
                break;
            } else if (arbete.equals("K")) {
                System.out.println("hur många kvadratmeter är arbetet");
                double m2 = in.nextDouble();
                System.out.println("Du behöver " + Math.ceil(((12 * m2) / (kakelplattor))) + "st paket med kakelplattor,");
                System.out.print(Math.ceil(((0.2 * m2) / (kakelfix))) + "st paket med kakelfix");
                System.out.println("och " + Math.ceil(((0.15 * m2) / (kakelfog))) + "st paket med kakelfog");
                break;
            } else {
                System.out.println("Fel input, testa igen");
                continue Arbete;
            }
        }
    }
}
