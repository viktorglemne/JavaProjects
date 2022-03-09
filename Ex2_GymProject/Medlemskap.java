package Ex2_GymProject;

import java.util.Scanner;

public class Medlemskap {

    public void medlemskapPris() {

        // Scanner som kan spara värden
        Scanner in = new Scanner(System.in);

        // frågar vilket typ av medlemskap som vill bli registrerat
        System.out.println("\nHur länge vill du vara medlem?");
        System.out.println("1. 1-2  månader - 400 SEK/ mån ");
        System.out.println("2. 3-6  månader - 350 SEK/ mån ");
        System.out.println("3. 7-12 månader - 300 SEK/ mån ");
        System.out.println("4. längre än 12 månader - 250 SEK/ mån ");

        // Lopp för att utföra switch
        while (true) {
            int selectMenu = in.nextInt();
            switch (selectMenu) {
                case 1: {
                    medlemskap1();
                    break;
                }
                case 2: {
                    medlemskap2();
                    break;
                }
                case 3: {
                    medlemskap3();
                    break;
                }
                case 4: {
                    medlemskap4();
                    break;
                }
                default: {
                    System.out.println("ogiltigt menyval");
                    break;
                }
            }
        }
    }

    // skriver ut vad för pris som medlemen får utefter val i switch, därefter går till inloggningsmeny
    private void medlemskap4() {
        System.out.println("Ditt pris blir 250SEK i månaden plus 100kr för medlemskap");
        System.out.println("\nDu är nu medlem på Gym WakeUp \nlogga in för boka pass" );
        new Menyer().inloggMeny();
    }

    private void medlemskap3() {
        System.out.println("Ditt pris blir 300SEK i månaden plus 100kr för medlemskap");
        System.out.println("\nDu är nu medlem på Gym WakeUp \nlogga in för boka pass" );
        new Menyer().inloggMeny();
    }

    private void medlemskap2() {
        System.out.println("Ditt pris blir 350SEK i månaden plus 100kr för medlemskap");
        System.out.println("\nDu är nu medlem på Gym WakeUp \nlogga in för boka pass" );
        new Menyer().inloggMeny();
    }

    private void medlemskap1() {
        System.out.println("Ditt pris blir 400SEK i månaden plus 100kr för medlemskap");
        System.out.println("\nDu är nu medlem på Gym WakeUp \nlogga in för boka pass" );
        new Menyer().inloggMeny();
    }
}