package com.glemne;

import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        System.out.print("\n > How many patients allowed for day 25-12-2016 : ");
        int ArraySize = input.nextInt();

        System.out.print("\n > Enter patient ID: ");
        int ID[] = new int[ArraySize];

        for (
                int i = 0;
                i < ID.length; i++) {
            ID[i] = input.nextInt();
        }


        System.out.print("\n > Enter patient First Name: ");
        String first[] = new String[ArraySize];
        for (
                int i = 0;
                i < first.length; i++) {
            first[i] = reader.nextLine();
        }
        System.out.print("\n > Enter patient last Name: ");
        String last[] = new String[ArraySize];
        for (
                int i = 0;
                i < last.length; i++) {
            last[i] = reader.nextLine();
        }

        System.out.print("\n _______________________________________________\n"
                + "|                                               |\n"
                + "|                  Case Type                    |\n"
                + "|_______________________________________________|\n"
                + " \n"
                + " _______________________________________________\n"
                + "|                        |\n"
                + "| 1: Enter 1 for Accident Injury                | \n"
                + "| 2: Enter 2 for Fire Injury                    | \n"
                + "| 3: Enter 3 for Electricity Sho                | \n"
                + "| 4: Enter 4 for Heart Attack                   | \n"
                + "| 5: Enter 5 for Unconscious                    | \n"
                + "| 6: Enter 6 for Otherwise                      | \n"
                + "|_______________________________________________|\n"
                + " > Please enter your choice: \n"
                + " ");
        int choice = input.nextInt();

        // if (int == 1)
    }
}