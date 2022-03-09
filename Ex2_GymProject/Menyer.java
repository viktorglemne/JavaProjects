package Ex2_GymProject;

import java.util.Scanner;

public class Menyer {

    // olika objekt för klasser som behövs i denna klass
    InloggningGym loggIn = new InloggningGym();
    NyMedlem medlem = new NyMedlem();

    // utför första menysats
    public void nyMedMeny(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nVälkommen till WakeUp gym \n   1. Bli medlem \n   2. Avsluta" );
        while (true){
            int selectMenu = scan.nextInt();
            switch (selectMenu) {
                case 1: {
                    medlem.medlemskap();
                    break;
                }
                case 2: {
                    loggIn.loggaIn();
                }
                case 3: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("ogiltigt menyval");
                    break;
                }
            }
        }
    }

    // utför inloggnings menysats
    public void inloggMeny() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n   1.logga in  \n   2. Avsluta" );
        while (true){
            int selectMenu = scan.nextInt();
            switch (selectMenu) {
                case 1: {
                    loggIn.loggaIn();
                    break;
                }
                case 2: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("ogiltigt menyval");
                    break;
                }
            }
        }
    }
}

