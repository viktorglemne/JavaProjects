package com.glemne;

import java.util.Scanner;

public class IfOvning2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Frågar om moment 1 och sparar ned i variabel med namn assignment
        System.out.println("Ange poäng på inlämningsuppgiften: ");
        double assignment = input.nextInt();

        // Frågar om moment 2 och sparar ned i variabel med namn presentation
        System.out.println("Ange poäng på presentationen: ");
        double presentation = input.nextInt();

        // Frågar om moment 3 och sparar ned i variabel med namn test
        System.out.println("Ange poäng på provet: ");
        double test = input.nextInt();

        double averageSum = ((assignment + presentation + test) / 3) / (100);
        System.out.println(averageSum);

        // Skriv din kod här. Skriv sedan ut vilket betyg studenten får.
        if (averageSum >= 0.9) {
            System.out.println("Du fick betyg MVG");
        } else if (averageSum >= 0.7 && averageSum <= 0.9) {
            System.out.println("Du fick betyg VG");
        } else if (averageSum >= 0.5 && averageSum <= 0.7) {
            System.out.println("Du fick betyg G");
        } else  {
            System.out.println("Du fick betyg U");
        }

    }
}
